# 금광
'''
2
3 4
1 3 3 2 2 1 4 1 0 6 4 7
4 4
1 3 1 5 2 2 4 1 5 0 2 3 0 6 1 2
'''

# 내 방법
# 풀이봄 -> 다시 안보기로 함 최대한 해보자
t = int(input())
for _ in range(t):
  n, m = map(int, input().split())
  matrix = [ [0] * m for _ in range(n) ]
  arr = list(map(int, input().split()))
  for i in range(n):
    for j in range(m):
      matrix[i][j] = arr[i * m + j]
  # print(matrix)
  
  d = [ [0] * m for _ in range(n) ]
  
  for i in range(n):
    d[i][0] = matrix[i][0]
    
  for j in range(1, m):
    for i in range(n):
      d[i][j] = d[i][j - 1] + matrix[i][j]
      if i - 1 >= 0:
        d[i][j] = max(d[i][j], d[i - 1][j - 1] + matrix[i][j])
      if i + 1 < n:
        d[i][j] = max(d[i][j], d[i + 1][j - 1] + matrix[i][j])
        
  answer = 0
  for i in range(n):
    answer = max(answer, d[i][m-1])
  
  print(answer)

# 풀이
# 테스트 케이스 (Test Case) 입력
for tc in range(int(input())):
  # 금광 정보 입력
  n, m = map(int, input().split())
  array = list(map(int, input().split()))
  # 다이나믹 프로그래밍을 위한 2차원 DP 테이블 초기화
  dp = []
  index = 0
  for i in range(n):
    dp.append(array[index:index + m])
    index += m
  # 다이나믹 프로그래밍 진행
  for j in range(1, m):
    for i in range(n):
      # 왼쪽 위에서 오는 경우
      if i == 0: left_up = 0
      else: left_up = dp[i - 1][j - 1]
      # 왼쪽 아래에서 오는 경우
      if i == n - 1: left_down = 0
      else: left_down = dp[i + 1][j - 1]
      # 왼쪽에서 오는 경우
      left = dp[i][j - 1]
      dp[i][j] = dp[i][j] + max(left_up, left_down, left)
  result = 0
  for i in range(n):
    result = max(result, dp[i][m - 1])
  print(result)