# 1이 될때까지

# 내 방법
'''n, k = map(int, input().split())

count = 0

while n != 1:
  if n % k == 0:
    n /= k
  else:
    n -= 1  
  count += 1
  
print(count)'''

# 풀이
n, k = map(int, input().split())

result = 0

# 시간복잡도가 log 복잡도로 나올 수 있다고 함
# 따라서 n, k가 문제 조건보다 더 커지더라도 풀 수 있음
while True:
  # N이 K로 나누어 떨어지는 수가 될 때까지 빼기
  # 이렇게하면 가장 가까운 k로 나누어 떨어지는 수를 찾을 수 있음
  target = (n // k) * k 
  # 1을 빼는 연산 횟수를 더 하줌
  result += (n - target)
  n = target
  # N이 K보다 작을 떄 (더 이상 나울 수 없을 때) 반복문 탈출
  if n < k:
    break
  # K로 나누기
  result += 1
  n //= k

# 마지막으로 남은 수에 대하여 1씩 빼기
result += (n - 1)
print(result)