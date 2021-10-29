# 효율적인 화폐 구성
'''
2 15
2
3

3 4
3
5
7
'''

# 내 방법
'''
d[i] = i원일 때 최소 화폐 개수
'''
'''n, m = list(map(int, input().split()))

array = []

for i in range(n):
  array.append(int(input()))
  
d = [100001] * 100001

for a in array:
  d[a] = 1
  
for i in range(1, m + 1):
  for a in array:
    if i - a < 1:
      continue
    d[i] = min(d[i], d[i - a] + 1)

print(d[m] if d[m] != 100001 else -1)'''

# 풀이
n, m = map(int, input().split())
# N개의 화폐 단위 정보를 입력받기
array = []
for i in range(n):
  array.append(int(input()))
  
# 한 번 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [10001] * (m + 1)

# 다이나믹 프로그래밍 (Dynamic Programming) 진행 (바텀업)
d[0] = 0
for i in range(n):
  for j in range(array[i], m + 1):
    if d[j - array[i]] != 10001: # (i - k)원을 만드는 방법이 존재하는 경우
      d[j] = min(d[j], d[j - array[i]] + 1)
      
# 계산된 결과 출력
if d[m] == 10001: # 최종적으로 M원을 만드는 방법이 없는 경우
  print(-1)
else:
  print(d[m])