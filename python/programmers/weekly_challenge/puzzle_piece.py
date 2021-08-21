# 퍼즐 조각 채우기
'''
    테이블 위에 놓인 퍼즐 조각을 게임 보드의 빈 공간에 적절히 올려놓으려고 함
    게임 보드와 테이블 모두 각 칸이 1x1 
    이 때, 다음 규칙에 따라 
    테이블 위에 놓인 퍼즐 조각을 게임 보드의 빈칸에 채우면 됨
    
        조각은 한 번에 하나씩 채워 넣음
        조각을 회전시킬 수 있음
        조각을 뒤집을 수는 없음
        게임 보드에 새로 채워 넣은 퍼즐 조각과 인접한 칸이 비어있으면 안됨
        
    모든 퍼즐 조각은 격자 칸에 딱 맞게 놓여있으며,
    격자 칸을 벗어나거나, 걸쳐 있는 등 잘못 놓인 경우는 없음
    
    현재 게임 보드의 상태 game_board, 
    테이블 위에 놓인 퍼즐 조각의 상태 table이 매개변수로 주어짐
    규칙에 맞게 최대한 많은 퍼즐 조각을 채워 넣을 경우,
    총 몇 칸을 채울 수 있는지 return 하도록 solution 함수 완성
    
    제한사항
    3 <= game_board의 행 길이 <= 50
    game_board의 각 열 길이 = game_board의 행 길이
        즉, 게임 보드는 정사각 격자 모양
        game_board의 모든 원소는 0 또는 1
        0은 빈칸, 1은 이미 채워진 칸
        퍼즐 조각이 놓일 빈칸은 1x1 크기 정사각형이 
        최소 1개에서 최대 6개까지 연결된 형태로만 주어짐
    table의 행 길이 = game_board의 행 길이
    table의 각 열 길이 = table의 행 길이
        즉, 테이블은 game_board와 같은 크기의 정사각 격자 모양
        table의 모든 원소는 0 또는 1
        0은 빈칸, 1은 조각이 놓인 칸
        퍼즐 조각은 1x1 크기 정사각형이 
        최소 1개에서 최대 6개까지 연결된 형태로만 주어짐
    gmae_board에는 반드시 하나 이상의 빈칸이 있음
    table에는 반드시 하나 이상의 블록이 놓여 있음
    
    블록 회전 가능함
    x y 교환하면 회전됨
    
    x, y 기준
    90도 회전
    [0 -1] -> [-y x]
    [1 0]
    180도 -> [-x, -y]
    [-1 0]
    [0 -1]
    270도
    [0 1] -> [y, -x]
    [-1 0]
    
    
'''
import copy

def findPiece(table, row, col, x, y, piece, mark, isPiece = 1):
    n = len(table)
    if row < 0 or col < 0 or row >= n or col >= n:
        return
    if table[row][col] != isPiece:
        return
    
    table[row][col] = mark
    piece.append([x, y])

    findPiece(table, row + 1, col, x + 1, y, piece, mark, isPiece)
    findPiece(table, row, col + 1, x, y + 1, piece, mark, isPiece)
    findPiece(table, row - 1, col, x - 1, y, piece, mark, isPiece)
    findPiece(table, row, col - 1, x, y - 1, piece, mark, isPiece)
    
    return piece

def rotate(piece, rot):
    rotPiece = []
    
    for x, y in piece:
        if rot == 90:
            rotPiece.append([y, -x])
        elif rot == 180:
            rotPiece.append([-x, -y])
        else: # 270
            rotPiece.append([-y, x])
    
    return rotPiece

def checkPiece(p1, p2):
    if len(p1) != len(p2):
        return False

    for p in p1:
        if p not in p2:
            return False
    
    return True

def matchPiece(game_board, row, col, piece):
    # 임시 보드
    board = copy.deepcopy(game_board)
    
    board_piece = findPiece(board, row, col, 0, 0, [], 1, 0)
    
    if checkPiece(board_piece, piece):
        # match시 board에 piece 채우기
        for x, y in piece:
            r = row + x
            c = col + y
            game_board[r][c] = 1
            
        return True
    
    return False
    
def solution(game_board, table):
    answer = 0
    
    n = len(game_board)
    mark = 2
    
    # table에서 piece 찾기
    pieces = {}
    for i in range(n):
        for j in range(n):
            if table[i][j] == 1:
                piece = findPiece(table, i, j, 0, 0, [], mark)
                pieces[mark] = {0 : piece}
                
                for r in range(1, 4):
                    rot = r * 90
                    pieces[mark][rot] = rotate(piece, rot)

                    # piece 위치 조정
                    pieces[mark][rot].sort()                    
                    x, y = 0, 0
                    for k in range(len(pieces[mark][rot])):
                        if k == 0:
                            x, y = pieces[mark][rot][k]
                            pieces[mark][rot][k] = [0, 0]
                        else:
                            pieces[mark][rot][k][0] -= x
                            pieces[mark][rot][k][1] -= y
                
                mark += 1

    # board에서 piece 찾기
    board_pieces = []
    for i in range(n):
        for j in range(n):
            if game_board[i][j] == 0:
                board_pieces.append(findPiece(game_board, i, j, 0, 0, [], 1, 0))
    
    # piece 매칭
    for board_piece in board_pieces:
        isMatch = False
        for key in pieces.keys():
            for rot in pieces[key].keys():
                if checkPiece(board_piece, pieces[key][rot]):
                    answer += len(board_piece)
                    isMatch = True
                    break
            if isMatch:
                del pieces[key]        
                break
    
    # print(answer)
    return answer

game_board = [[1,1,0,0,1,0],[0,0,1,0,1,0],[0,1,1,0,0,1],[1,1,0,1,1,1],[1,0,0,0,1,0],[0,1,1,1,0,0]]
table = [[1,0,0,1,1,0],[1,0,1,0,1,0],[0,1,1,0,1,1],[0,0,1,0,0,0],[1,1,0,1,1,0],[0,1,0,0,0,0]]
result = 14

print (result == solution(game_board, table))

game_board = [[0,0,0],[1,1,0],[1,1,1]]
table = [[1,1,1],[1,0,0],[0,0,0]]
result = 0

print (result == solution(game_board, table))