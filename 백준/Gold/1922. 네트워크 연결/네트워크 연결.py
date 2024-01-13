import heapq

n = int(input())
m = int(input())
tree = [[] for _ in range(n + 1)]

for _ in range(m):
    a, b, w = map(int, input().split())
    tree[a].append([w, b])
    tree[b].append([w, a])

hq = []
visited = [False] * (n + 1)
for i in tree[1]:
    heapq.heappush(hq, (i[0], i[1]))
visited[1] = True

result = 0
while hq:
    w, b = heapq.heappop(hq)
    if not visited[b]:
        visited[b] = True
        result += w
        for i in tree[b]:
            heapq.heappush(hq, (i[0], i[1]))

print(result)