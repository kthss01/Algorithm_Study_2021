# 최대공약수 계산 (유클리드 호제법) 예제

def gcd(a, b):
  if a % b == 0:
    return b
  else:
    gcd(b, a % b)
    
print(gcd(192, 162)) # 꼭 a > b 일 필요가 없다고 함