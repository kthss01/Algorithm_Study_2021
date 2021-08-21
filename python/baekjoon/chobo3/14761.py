# FizzBuzz
'''
    1 ~ N 숫자 출력
    X로 나눠질 수 있으면 Fizz
    Y로 나눠질 수 있으면 Buzz
    
    X Y 둘 다 나눠질 수 있으면 FizzBuzz
    
    입력
    X, Y, N (1 <= X < Y <= N <= 100)
    출력
    1 ~ N까지 쭉 출력하면서 Fizz or Buzz 출력
'''
import sys 
x, y, n = map(int, sys.stdin.readline().split())
# x, y, n = map(int, input().split())

for i in range(1, n + 1):
    answer = '';
    
    if i % x == 0:
        answer += 'Fizz'
    if i % y == 0:
        answer += 'Buzz'
    if answer == '':
        answer = i

    print(answer)