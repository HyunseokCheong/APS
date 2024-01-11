import sys

from collections import deque


def dfs(graph, v, visited):
    visited[v] = True
    print(v, end=' ')
    for i in range(1, len(graph)):
        if not visited[i] and graph[v][i] == 1:
            dfs(graph, i, visited)


def bfs(graph, v):
    queue = deque([v])
    visited = [False] * len(graph)
    visited[v] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in range(1, len(graph)):
            if not visited[i] and graph[v][i] == 1:
                queue.append(i)
                visited[i] = True


input = sys.stdin.readline
n, m, v = map(int, input().split())
graph = [[0] * (n + 1) for _ in range(n + 1)]

for i in range(m):
    s, e = map(int, input().split())
    graph[s][e] = 1
    graph[e][s] = 1

visited = [False] * (n + 1)
dfs(graph, v, visited)
print()
bfs(graph, v)