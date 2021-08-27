# 피보나치 수 2
'''
    n 이 주어질 때 n번째 피보나치 수 구하기
    n 90보다 작거나 같은 자연수
'''

def fibo(n):
    dp = [0 for _ in range(100)]
    
    dp[1] = 1
    
    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-2]
        
    return dp[n]

n = int(input())

print(fibo(n))