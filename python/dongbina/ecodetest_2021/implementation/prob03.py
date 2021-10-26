# 문자열 재정렬

# 내가 푼거랑 풀이 동일
s = input()

s_list = []
num = 0

for i in range(len(s)):
  if ord(s[i]) >= ord('A') and ord(s[i]) <= ord('Z'):
    s_list.append(s[i])
  else:
    num += int(s[i])
    
s_list.sort()

if num != 0:
  s_list.append(str(num))
  
result = ''.join(s_list) # 리스트 문자열로 변환하여 합침

print(result)