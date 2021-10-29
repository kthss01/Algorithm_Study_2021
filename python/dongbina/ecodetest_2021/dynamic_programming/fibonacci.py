# 피보나치 수열 : 단순 재귀 소스코드
# 피보나치 함수 (Fibonacci Function)을 재귀함수로 표현
def fibo(x):
  if x == 1 or x == 2:
    return 1
  return fibo(x - 1) + fibo(x - 2)

print(fibo(4))