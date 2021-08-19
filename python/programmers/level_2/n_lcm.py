# N개의 최소공배수
'''
    두 수의 최소공배수 (Least Common Multiple)란
    입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미함
    ea)
    2, 7 최소공배수 14
    
    n개의 수의 최소공배수는 
    n개의 수들의 배수 중 공통이 되는 가장 작은 숫자
    
    n개의 숫자를 담은 배열 arr이 입력 되었을 때
    이 수들의 최소공배수를 반환하는 함수, solution 완성
    
    제한 사항
        arr은 길이 1이상, 15이하인 배열
        arr의 원소는 100 이하인 자연수
'''

def gcd(a, b):
    if a < b:
        a, b = b, a
    
    while b != 0:
        n = a % b
        a = b
        b = n
        
    return a

def lcm(a, b):
    return (a * b) / gcd(a, b)

import math

def solution(arr):
    answer = arr[0]
    
    # for i in range(len(arr) - 1):
    #     if i == 0:
    #         answer = lcm(arr[i], arr[i+1])
    #     else:
    #         answer = lcm(answer, arr[i+1])
    
    for n in arr:
        answer = n * answer // math.gcd(n, answer) # math안에 gcd 있다고함
        # answer = math.lcm(answer, n) # math 안에 lcm도 있음 # 파이썬 3.9부터
        
    return answer

arr = [2,6,8,14]
result = 168
print(f'예제 : {result == solution(arr)}')

arr = [1,2,3]
result = 6
print(f'예제 : {result == solution(arr)}')