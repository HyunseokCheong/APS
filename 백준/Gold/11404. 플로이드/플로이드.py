import sys

input = sys.stdin.readline

n = int(input())
m = int(input())

g = [[sys.maxsize] * (n + 1) for _ in range(n + 1)]
for i in range(1, n + 1):
    g[i][i] = 0

for i in range(m):
    a, b, c = map(int, input().split())
    g[a][b] = min(g[a][b], c)

for k in range(1, n + 1):
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            g[i][j] = min(g[i][k] + g[k][j], g[i][j])

for i in range(1, n + 1):
    for j in range(1, n + 1):
        if g[i][j] == sys.maxsize:
            print(0, end=" ")
        else:
            print(g[i][j], end=" ")
    print()