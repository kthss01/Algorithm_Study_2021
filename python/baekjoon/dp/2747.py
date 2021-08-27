# 피보나치 수 
'''
    n 주어질 때 (n 45보다 작거나 같은 자연수)
    n 번째 피보나치 수 구하기
'''

# 이렇게만하면 시간초과 남 -> dp 사용
def fibonacci(n):
    if n == 1:
        return 1
    if n == 2:
        return 1
    
    return fibonacci(n-1) + fibonacci(n-2)

# d = [0 for i in range(100)]
d = [0] * 100

# top_down
def fibo_dp(n):
    if n == 1:
        return 1
    if n == 2:
        return 1
    
    if d[n] != 0:
        return d[n]
    
    d[n] = fibo_dp(n-1) + fibo_dp(n-2)
    
    return d[n]


# bottom_up
def fibo_dp2(n):
    dp = [0] * 100
    
    dp[1] = 1
    
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]

    return dp[n]

n = int(input())


# print (fibonacci(n))
# print (fibo_dp(n))
print (fibo_dp2(n))