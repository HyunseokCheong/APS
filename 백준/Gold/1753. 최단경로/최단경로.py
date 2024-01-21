import heapq

v, e = map(int, input().split())
k = int(input())

graph = [[] for _ in range(v + 1)]
for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a].append([b, c])

hq = []
dist = [float('inf') for _ in range(v + 1)]

heapq.heappush(hq, (0, k))
dist[k] = 0

while hq:
    cost, node = heapq.heappop(hq)

    if cost > dist[node]:
        continue

    for next_node, next_cost in graph[node]:
        new_cost = cost + next_cost

        if new_cost >= dist[next_node]:
            continue

        heapq.heappush(hq, (new_cost, next_node))
        dist[next_node] = new_cost

for i in range(1, v + 1):
    print(dist[i] if dist[i] != float('inf') else 'INF')