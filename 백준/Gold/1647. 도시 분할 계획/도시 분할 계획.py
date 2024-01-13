import heapq


def find(x) -> int:
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


def union(x, y):
    root_x = find(x)
    root_y = find(y)

    if root_x < root_y:
        parent[root_y] = root_x
    elif root_x > root_y:
        parent[root_x] = root_y


n, m = map(int, input().split())

hq = []
for _ in range(m):
    vertex1, vertex2, weight = map(int, input().split())
    heapq.heappush(hq, (weight, vertex1, vertex2))

parent = [i for i in range(n + 1)]

result = 0
max_weight = 0
while hq:
    edge = heapq.heappop(hq)
    weight = edge[0]
    vertex1 = edge[1]
    vertex2 = edge[2]

    if find(vertex1) != find(vertex2):
        union(vertex1, vertex2)
        result += weight
        max_weight = weight

print(result - max_weight)