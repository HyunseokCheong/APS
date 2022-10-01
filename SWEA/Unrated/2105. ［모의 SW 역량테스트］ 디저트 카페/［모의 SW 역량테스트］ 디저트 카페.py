def isok(y, x):
    if 0 <= y < n and 0 <= x < n and vis[arr[y][x]] == 0:
        return True


def dfs(y, x, drt, cnt):
    global ans, r, c
    if drt < 3:
        cur = drt + 2
    else:
        cur = drt + 1

    for i in range(drt, cur):
        nr = y + dr[i]
        nc = x + dc[i]
        if nr == r and nc == c:
            ans = max(ans, cnt)
            return
        if isok(nr, nc):
            vis[arr[nr][nc]] = 1
            dfs(nr, nc, i, cnt + 1)
            vis[arr[nr][nc]] = 0


dr = [1, 1, -1, -1]
dc = [1, -1, -1, 1]

t = int(input())
for tc in range(t):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]

    vis = [0] * 101
    ans = -1

    for r in range(n):
        for c in range(n):
            vis[arr[r][c]] = 1
            dfs(r, c, 0, 1)
            vis[arr[r][c]] = 0

    print(f'#{tc + 1} {ans}')
