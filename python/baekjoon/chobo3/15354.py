# Aron
'''
    줄이 어떻게 되는지 확인하기
    같은 이름 한 그룹으로 침
    
    CZP -> 4 (3그룹이므로 4번째임)
    
    N (1 <= N <= 25) N 
    각각 대문자
    
    몇번째 줄인지 출력
'''
import sys

n = int(sys.stdin.readline())
line = []

for _ in range(n):
    c = sys.stdin.readline().rstrip("\n")
    line.append(c)

ans = 1;    

for i in range(len(line)-1):
    if line[i] != line[i+1]:
        ans += 1

print (ans + 1)

