# Judging Moose
'''
    moose 말코손바닥사슴
    break off 분리되다[갈라지다]
    
    사슴 뿔 좌 우가 주어질 때
    좌우가 같으면 둘을 합한 값을 출력하고 Even x
    다르면 큰값 x 2를 출력 Odd x
    둘다 0이면 Not a moose 출력
'''
import sys
l, r = map(int, sys.stdin.readline().split())
if l == 0 and r == 0:
    print('Not a moose')
elif l == r:
    print(f'Even {l+r}')
else:
    print(f'Odd {max(l, r) * 2}')