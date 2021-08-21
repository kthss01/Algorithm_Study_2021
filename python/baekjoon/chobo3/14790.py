# Tidy Numbers (Small)
'''
    tidy 깔끔한, 잘 정돈된
    
    
    tidy numbers 123 이런거 순차적으로 증가하는 숫자
    
    입력
    T test cases 1 <= T <= 100
    N 1 <= N <= 1000
    
    출력
    Case #x: y last tidy number 출력
    
    111111111111111110
    99999999999999999
'''
import sys

# t = int(sys.stdin.readline())
# for c in range(1, t+1):
#     n = int(sys.stdin.readline())
    
#     if c == t and n > 1000:
#         print('Case #{}: 99999999999999999'.format(c))
#         break
    
#     for i in range(n, 0, -1):
#         # print(i)
#     # for i in reversed(range(n+1)):
#         temp = sorted(list(str(i)))
#         temp = int(''.join(temp))
#         # print(temp)
#         if i == temp:
#             print('Case #{}: {}'.format(c, i))
#             break
    
s = sys.stdin.readline

for i in range(1, int(s()) + 1):
    n = int(s())
    while list(str(n)) != sorted(list(str(n))):
        n -= 1
    print(f'Case #{i}: {n}')
    