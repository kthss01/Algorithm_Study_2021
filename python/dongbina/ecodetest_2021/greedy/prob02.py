# 곱하기 혹은 더하기

# 내가 푼 방법
'''s = str(input())

result = 0

if len(s) == 1:
  result = s[0]
else:  
  cur = int(s[0])
  next = int(s[1])
  result = result = cur + next if cur + next > cur * next else cur * next

for i in range(2, len(s)):
  # print(s[i])
  num = int(s[i])
  result = result + num if result + num > result * num else result * num

print(result)'''

# 풀이
data = input() # 바로 문자열로 들어가는듯

# 첫 번째 문자를 숫자로 변경하여 대입
result = int(data[0])

for i in range(1, len(data)):
  # 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
  num = int(data[i])
  if num <= 1 or result <= 1:
    result += num
  else:
    result *= num
  
print(result)