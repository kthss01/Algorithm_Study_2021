# 막대기
'''
N개의 막대기에 대한 높이 정보가 주어질 때,
오른쪽에서 보아서 몇 개가 보이는지 알아내기

N (2 <= N <= 100,000)
막대기의 높이를 나타내는 정수 h (1 <= h <= 100,000)

보이는 막대기의 개수 출력
'''
import sys
input = sys.stdin.readline
n = int(input())

h_list = []
for _ in range(n):
    h = int(input())
    h_list.append(h)

h_list.reverse()    
max_h = 0
cnt = 0
for h in h_list:
    if h > max_h:
        cnt += 1
        max_h = h

print(cnt)
    