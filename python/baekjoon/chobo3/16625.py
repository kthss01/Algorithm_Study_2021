# Das Blinkenlights
'''
    p, q (1 <= p, q <= 100) s (1 <= s <= 10000) 가 주어질때
    p q 최소 공배수가 s보다 작거나 같으면 yes 아니면 no 출력
'''
import sys
import math

p, q, s = map(int, sys.stdin.readline().split(' '))

if (p * q) / math.gcd(p, q) <= s:
    print("yes")
else:
    print("no")