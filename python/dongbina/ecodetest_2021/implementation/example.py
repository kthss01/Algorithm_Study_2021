# 상하좌우

# 내가 풀기
'''n = int(input())
moves = input().split()

matrix = [ [0] * (n + 1) for _ in range(n + 1)]

x, y = 1, 1

direction = {
  'L' : (0, -1),
  'R' : (0, 1),
  'U' : (-1, 0),
  'D' : (1, 0),
}

for move in moves:
  dx, dy = direction[move]
  nx, ny = x + dx, y + dy
  if nx <= 0 or nx > n or ny <= 0 or ny > n:
    continue
  x = nx
  y = ny

print(f'{x} {y}')'''

# 풀이
# N 입력 받기
n = int(input())
x, y = 1, 1
plans = input().split()

# L, R, U, D에 따른 이동 방향
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

# 이동 계획을 하나씩 확인하기
for plan in plans:
  # 이동 후 좌표 구하기
  for i in range(len(move_types)):
    if plan == move_types[i]:
      nx = x + dx[i]
      ny = y + dy[i]
  # 공간을 벗어나는 경우 무시
  if nx < 1 or ny < 1 or nx > n or ny > n:
    continue
  # 이동 수행
  x, y = nx, ny

print(x, y) # 이렇게 쓰면 띄어쓰기로 되는 듯