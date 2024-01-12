import sys

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline


def recur(node: int):
    visited[node] = True
    for i in graph[node]:
        if not visited[i]:
            parent[i] = node
            recur(i)


n = int(input())
graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)
parent = [0] * (n + 1)

for _ in range(n - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

recur(1)

print(*parent[2:], sep="\n")