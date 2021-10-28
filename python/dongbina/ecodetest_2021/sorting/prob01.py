# 두 배열의 원소 교체
'''
5 3
1 2 5 4 3
5 5 6 6 5
'''

# 내 방법 풀이와 비슷함 (풀이가 좀더 잘함)
n, k = map(int, input().split())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

arr1.sort()
arr2.sort(reverse=True)

for i in range(k):
  # 여기 부분 그냥 교환하면 안되고 작은 경우에만 교환하고
  if arr1[i] < arr2[i]:
    arr1[i], arr2[i] = arr2[i], arr1[i]
  # 작지 않으면 break 걸어야함
  else:
    break
  
# sum = 0
# for i in range(n):
#   sum += arr1[i]
  
print(sum(arr1)) # 메소드 있음


