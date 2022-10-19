from collections import deque
import sys

input = sys.stdin.readline

n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

dr = [1, -1, 0, 0]
dc = [0, 0, 1, -1]

r, c, size = 0, 0, 2
for i in range(n):
    for j in range(n):
        if arr[i][j] == 9:
            r = i
            c = j


def bfs(r, c, size):
    dst = [[0] * n for _ in range(n)]
    vis = [[0] * n for _ in range(n)]
    q = deque()
    q.append((r, c))
    vis[r][c] = 1
    tmp = []
    while q:
        cr, cc = q.popleft()
        for i in range(4):
            nr = cr + dr[i]
            nc = cc + dc[i]
            if 0 <= nr < n and 0 <= nc < n and vis[nr][nc] == 0:
                if arr[nr][nc] <= size:
                    q.append((nr, nc))
                    vis[nr][nc] = 1
                    dst[nr][nc] = dst[cr][cc] + 1
                    if arr[nr][nc] < size and arr[nr][nc] != 0:
                        tmp.append((nr, nc, dst[nr][nc]))
    return sorted(tmp, key=lambda x: (-x[2], -x[0], -x[1]))


cnt = 0
res = 0
while True:
    shark = bfs(r, c, size)
    if not shark:
        break
    nr, nc, nd = shark.pop()
    res += nd
    arr[r][c] = 0
    arr[nr][nc] = 0
    r, c = nr, nc
    cnt += 1
    if cnt == size:
        size += 1
        cnt = 0
print(res)
