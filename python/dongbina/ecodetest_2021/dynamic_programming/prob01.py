# 개미 전사
'''
4
1 3 1 5
'''

# 내 방법
'''
d[x] = x일때 얻을 수 있는 식량의 최댓값
'''
'''n = int(input())
array = list(map(int, input().split()))

d = [0] * 101
d[0] = array[0]
d[1] = max(d[0], array[1])

def dp(x):
  for i in range(2, x):
    d[i] = max(d[i-1], d[i-2] + array[i])

  return d[x - 1]

print(dp(n))'''

# 풀이
# 정수 N을 입력 받기
n = int(input())
# 모든 식량 정보 입력 받기
array = list(map(int, input().split()))

# 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [0] * 100

# 다이나믹 프로그래밍 (Dynamic Programming) 진행 (바텀업)
d[0] = array[0]
d[1] = max(array[0], array[1])
for i in range(2, n):
  d[i] = max(d[i - 1], d[i- 2] + array[i])
  
# 계산된 결과 출력
print(d[n - 1])