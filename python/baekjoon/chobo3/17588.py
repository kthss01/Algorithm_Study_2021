# Missing Numbers
'''
순차적인 숫자들을 입력받았을 때 놓친 숫자 출력하기

1 <= n <= 100
1 ~ 200 사이 숫자

예제
9
2
4
5
7
8
9
10
11
13

1
3
6
12

5
1
2
3
4
5

good job - 다 나왔으면
'''

n = int(input())

nums = [ True for _ in range(201)]
nums[0] = False
maxNum = 1

for i in range(n):
    d = int(input())
    nums[d] = False
    maxNum = d
    
ans = []
for i in range(maxNum):
    if nums[i]:
        ans.append(i)
        
# print(ans)
        
if not ans:
    print('good job')
else:
    for a in ans:
        print(a)
