# 병사 배치하기
'''
7
15 11 4 8 5 2 4
'''


# 내 방법
# 풀이 봄 LIS 문제였다고 함
'''
dp[i] = i번째 병사일 때 최대 길이
'''
'''n = int(input())
array = list(map(int, input().split()))

dp = [1] * n

for i in range(1, n):
  # 여기서 막힘
  pass

print(dp[n - 1])'''

# 풀이
n = int(input())
array = list(map(int, input().split()))
# 순서를 뒤집어 '최장 증가 부분 수열' 문제로 변환
array.reverse()

# 다이나믹 프로그래밍을 위한 1차원 DP 테이블 초기화
dp = [1] * n

# 가장 긴 증가하는 부분 수열(LIS) 알고리즘 수행
for i in range(1, n):
  for j in range(0, i):
    if array[j] < array[i]:
      dp[i] = max(dp[i], dp[j] + 1)
    
# 열외해야 하는 병사의 최소 수를 출력
print(n - max(dp))