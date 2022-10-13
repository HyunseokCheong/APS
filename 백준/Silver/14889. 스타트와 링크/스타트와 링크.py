import sys

input = sys.stdin.readline


def dfs(depth, idx):
    global mnv
    if depth == n // 2:
        p1, p2 = 0, 0
        for i in range(n):
            for j in range(n):
                if vis[i] and vis[j]:
                    p1 += arr[i][j]
                elif not vis[i] and not vis[j]:
                    p2 += arr[i][j]
        mnv = min(mnv, abs(p1 - p2))
        return
    for i in range(idx, n):
        if vis[i] == 0:
            vis[i] = 1
            dfs(depth + 1, i + 1)
            vis[i] = 0


n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
vis = [0] * n
mnv = 1e9

dfs(0, 0)
print(mnv)
