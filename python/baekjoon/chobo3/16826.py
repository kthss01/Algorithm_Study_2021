# GuruGuru
'''
    R 오른쪽 회전 L 왼쪽 회전
    90도씩 돔
    4번 돌면 1바퀴
    회전이 주어질 때 몇바퀴 회전했는지 구하기
    
    규칙
        회전 시작 북쪽
        회전 끝 북쪽
        처음 끝 제외하고는 북쪽 보면 안됨
        R 명령 이후 북 동 남 서 한번 이상씩 봐야함
    
    처음 북쪽 보고 시작
    
    입력 문자열 하나로 주어짐
    출력 회전수 출력
'''
rotates = input()

state = 0
cnt = 0

# check = [False, False, False, False]

# for rotate in rotates:
#     if rotate == "R":
#         state += 1
#         if state >= 4:
#             state -= 4
#         check[state] = True
#     else:
#         state -= 1
#         if state < 0:
#             state += 4
    
    
    
#     if state == 0:
#         isRotate = True
#         for c in check:
#             if c == False:
#                 isRotate = False
#                 break
#         if isRotate:
#             cnt += 1
            
#         check = [False, False, False, False]

# print(cnt)
  
ans = 0
  
for rotate in rotates:
    if rotate == "R":
        cnt += 1
    else:
        cnt -= 1
    
    if cnt == 4:
        ans += 1
        cnt = 0
    elif cnt == -4:
        cnt = 0
        
print(ans)