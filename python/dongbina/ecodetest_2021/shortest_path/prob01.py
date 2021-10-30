# 전보
'''
3 2 1
1 2 4
1 3 2
'''

# 내 방법 출력 예시와 다르게 나옴 -> 이해함
'''import sys
import heapq

input = sys.stdin.readline
n, m, c = map(int, input().split())
INF = int(1e9)

graph = [[] for _ in range(n + 1)]
distance = [INF] * (n + 1)

for _ in range(m):
  a, b, cost = map(int, input().split())
  graph[a].append((b, cost))
  
def dijkstra(start):
  distance[start] = 0
  
  q = []
  heapq.heappush(q, (0, start))

  while q: 
    dist, now = heapq.heappop(q)
    if distance[now] < dist:
      continue
    for i in graph[now]:
      cost = dist + i[1]
      if cost < distance[i[0]]:
        distance[i[0]] = cost
        heapq.heappush(q, (cost, i[0]))
        
dijkstra(c)

count = 0
total = 0
for i in range(1, n + 1):
  if i != c and distance[i] != INF:
    count += 1
    total = max(total, distance[i]) # 이걸 잘못 이해함 더하는게 아니라 최대값을 넣어야함

print(count, total)'''

# 풀이
import heapq
import sys
input = sys.stdin.readline
INF = int(1e9) # 무한을 의미하는 갑승로 10억을 설정

def dijkstra(start):
  q = []
  # 시작 노드로 가기 위한 최단 경로는 0으로 설정하여, 큐에 삽입
  heapq.heappush(q, (0, start))
  distance[start] = 0
  while q: # 큐가 비어있지 않다면
    # 가장 최단 거리가 짧은 노드에 대한 정보를 꺼내기
    dist, now = heapq.heappop(q)
    if distance[now] < dist:
      continue
    # 현재 노드와 연결된 다른 인접한 노드들을 확인
    for i in graph[now]:
      cost = dist + i[1]
      # 현재 노드를 거쳐서, 다른 노드로 이동한 거리가 더 짧은 경우
      if cost < distance[i[0]]:
        distance[i[0]] = cost
        heapq.heappush(q, (cost, i[0]))
        
# 노드의 개수, 간선의 개수, 시작 노드 입력
n, m, start = map(int, input().split())
# 각 노드에 연결되어 있는 노드에 대한 정보를 담는 리스트 만들기
graph = [[] for i in range(n + 1)]
# 최단 거리 테이블을 모두 무한으로 초기화
distance = [INF] * (n + 1)

# 모든 간선 정보를 입력받기
for _ in range(m):
  x, y, z = map(int, input().split())
  # x번 노드에서 y번 노드로 가는 비용이 z라는 의미
  graph[x].append((y, z))
  
# 다익스트라 알고리즘 수행
dijkstra(start)

# 도달할 수 있는 노드의 개수
count = 0
# 도달할 수 있는 노드 중에서, 가장 멀리 있는 노드와의 최단 거리
max_distance = 0
for d in distance:
  # 도달할 수 있는 노드인 경우
  if d != INF:
    count += 1
    max_distance = max(max_distance, d)

# 시작 노드는 제외해야 하므로 count - 1을 출력
print(count - 1, max_distance)
