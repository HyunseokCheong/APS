import heapq
import sys

input = sys.stdin.readline


def find(x: int) -> int:
    if x != parent[x]:
        parent[x] = find(parent[x])
    return parent[x]


def union(x: int, y: int) -> None:
    root_x = find(x)
    root_y = find(y)

    if root_x < root_y:
        parent[root_y] = root_x
    elif root_x > root_y:
        parent[root_x] = root_y


n = int(input())
data = [list(map(int, input().split())) for i in range(n)]

parent = [i for i in range(n + 1)]
edges = []
for r in range(n):
    for c in range(r + 1, n):
        if r == c:
            continue
        heapq.heappush(edges, [data[r][c], r, c])

result = 0
while edges:
    edge = heapq.heappop(edges)
    w = edge[0]
    v1 = edge[1]
    v2 = edge[2]

    if find(v1) != find(v2):
        union(v1, v2)
        result += w
print(result)