'''
복서 정렬하기
복서 선수들의 몸무게 weights와, 복서 선수들의 전적을 나타내는
head2head가 매개변수로 주어짐
복서 선수들의 번호를 다음과 같은 순서로 정렬한 후 return하는 함수 구현

- 전체 승률이 높은 복서의 번호가 앞쪽으로 감. 
아직 다른 복서랑 붙어본 적이 없는 복서의 승률은 0%로 취급
- 승률이 동일한 복서의 번호들 중에서는 자신보다 몸무게가 무거운 복서를
이긴 횟수가 많은 복서의 번호가 앞쪽으로 감
- 자신보다 무거운 복서를 이긴 횟수까지 동일한 복서의 번호들 중에서
자기 몸무게가 무거운 복서의 번호가 앞쪽으로 감
- 자기 몸무게까지 동일한 복서의 번호들 중에서는 작은 번호가 앞쪽으로 감

제한사항
- weights의 길이는 2 이상 1,000 이하
    weights의 모든 값은 45 이상 150 이하의 정수
    weights[i]는 i+1번 복서의 몸무게(kg)를 의미
- head2head의 길이는 weights의 길이와 같음
    head2head의 모든 문자열은 길이가 weights의 길이와 동일
    N W L 로 이루어진 문자열
    head2head[i]는 i+1번 복서의 전적을 의미하며
    head2head[i][j]는 i+1번 복서와 j+1번 복서의 매치 결과를 의미
    
    N(None) 두 복서가 아직 붙어본 적이 없음
    W(Win) i+1번 복서가 j+1번 복서를 이김
    L(Lose) i+1번 복서가 j+1번 복서에게 졌음
    
    임의의 i에 대해서 head2head[i][i]는 항상 N
    자기자신과 싸울 수는 없기 때문
    
    임의의 i,j에 대해 head2head[i][j]에 맞게 head2head[j][i]과 됨
    W L, N N, L W 이란 얘기
'''

def solution(weights, head2head):
    answer = []
    
    # n = len(weights)
    # index = [ _ for _ in range(1, n+1)]
    
    # win = []
    # win_wt = []
    # for i in range(n):
    #     w = weights[i]
    #     h = head2head[i]
    #     win_cnt = 0
    #     lose_cnt = 0
    #     win_wt_cnt = 0
        
    #     for j in range(n):
    #         if h[j] == 'W':
    #             win_cnt += 1
    #             if w < weights[j]:
    #                 win_wt_cnt += 1
    #         elif h[j] == 'L':
    #             lose_cnt += 1
        
    #     if win_cnt == 0 and lose_cnt == 0:
    #         win.append(0)
    #     else:
    #         win.append(win_cnt / (win_cnt + lose_cnt))
    #     win_wt.append(win_wt_cnt)
    
    # result = [ _ for _ in zip(win, win_wt, weights, index)]
    
    # #print(result)
    
    # result = sorted(result, key = lambda x : (-x[0],-x[1],-x[2],x[3]))
    
    # #print(result)
    
    # answer = [ x[-1] for x in result ]
    
    # #print(answer)
    
    l = len(weights)
    
    # 승률, 무거운 복서 이긴횟수, 자기 몸무게, 번호 (음수로)
    boxer = [[0 for _ in range(4)] for _ in range(l)]
    
    for i in range(l):
        boxer[i][2] = weights[i]
        boxer[i][3] = -(i + 1) # 번호 음수로, 역순 정렬할꺼라
        cnt = 0 # 판수
        for j in range(l):
            if head2head[i][j] == 'W':
                boxer[i][0] += 1
                cnt += 1
                if weights[i] < weights[j]:
                    boxer[i][1] += 1
            elif head2head[i][j] == 'L':
                cnt += 1
        
        if cnt == 0:
            boxer[i][0] = 0
        else:
            boxer[i][0] /= cnt
            
    boxer.sort(reverse=True) # 역순 정렬
    # 파이썬 정렬은 동률이면 그 다음 요소보고 정렬함
    
    answer = [ -b[3] for b in boxer ]
    
    return answer

weights = [50,82,75,120]
head2head = ["NLWL","WNLL","LWNW","WWLN"]
result = [3,4,1,2]

print(solution(weights, head2head) == result)

weights = [145,92,86]
head2head = ["NLW","WNL","LWN"]
result = [2,3,1]

print(solution(weights, head2head) == result)

weights = [60,70,60]
head2head = ["NNN","NNN","NNN"]
result = [2,1,3]

print(solution(weights, head2head) == result)