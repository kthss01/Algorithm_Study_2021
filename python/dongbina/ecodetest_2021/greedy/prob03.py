# 모험가 길드

# 내가 푼 방법
# 아이디어 확인
'''n = int(input())
f_list = list(map(int, input().split()))

# print(f_list)
f_list.sort()
# print(f_list)

count = 0
fear = 1
group = 1

for f in f_list:
  if f <= fear:
    group -= 1
    if group == 0:
      group = fear
      count += 1
  else:
    fear += 1
    group = fear - 1

print(count)'''

# 풀이
n = int(input())
data = list(map(int, input().split()))
data.sort()

result = 0 # 총 그룹의 수
count = 0 # 현재 그룹에 포함된 모험가의 수

for i in data: # 공포도를 낮은 것부터 하나식 확인하며
  count += 1 # 현재 그룹에 해당 모험가를 포함시키기
  if count >= i: # 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
    result += 1 # 총 그룹의 수 증가시키기
    count = 0 # 현재 그룹에 포함된 모험가의 수 초기화

print(result) # 총 그룹의 수 출력
  