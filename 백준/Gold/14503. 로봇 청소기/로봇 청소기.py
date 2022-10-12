import sys

input = sys.stdin.readline


def clean(r, c, d):
    global ans
    if arr[r][c] == 0:
        arr[r][c] = 2
        ans += 1
    for _ in range(4):
        nd = (d + 3) % 4
        nr = r + dr[nd]
        nc = c + dc[nd]
        if arr[nr][nc] == 0:
            clean(nr, nc, nd)
            return
        d = nd
    nd = (d + 2) % 4
    nr = r + dr[nd]
    nc = c + dc[nd]
    if arr[nr][nc] == 1:
        return
    clean(nr, nc, d)


# 북 동 남 서
dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]

n, m = map(int, input().split())
r, c, d = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

ans = 0
clean(r, c, d)
print(ans)
