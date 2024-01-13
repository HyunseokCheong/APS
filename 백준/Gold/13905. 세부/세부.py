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
s, e = map(int, input().split())

edges = []
for _ in range(m):
    v1, v2, w = map(int, input().split())
    heapq.heappush(edges, (-w, v1, v2))

parent = [i for i in range(n + 1)]

answer = 0
while edges:
    edge = heapq.heappop(edges)
    w = -edge[0]
    v1 = edge[1]
    v2 = edge[2]

    if find(v1) != find(v2):
        union(v1, v2)

        if find(s) == find(e):
            answer = w
            break

print(answer)