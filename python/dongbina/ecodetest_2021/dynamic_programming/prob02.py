# 1로 만들기
'''
26
'''

# 내 방법 풀이와 같음
x = int(input())

d = [0] * 30001

for i in range(2, x + 1):
  d[i] = d[i - 1] + 1
  
  if i % 5 == 0:
    d[i] = min(d[i // 5] + 1, d[i])
  if i % 3 == 0:
    d[i] = min(d[i // 3] + 1, d[i])
  if i % 2 == 0:
    d[i] = min(d[i // 2] + 1, d[i])    

print(d[x])