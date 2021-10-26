# 시각

# 내가 푼 방법, 풀이와 동일
n = int(input())

count = 0
for h in range(n+1): # range(0, n+1) 말고 이렇게 써도 됨
  for m in range(60):
    for s in range(60):
      time = f'{h}:{m}:{s}' # 이렇게 말고 str(i) + str(j) + str(k) 이렇게 함
      if '3' in time:
        count += 1

print(count)