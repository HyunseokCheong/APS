from collections import deque
import copy
import sys

input = sys.stdin.readline

dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def wall(cnt):
    if cnt == 3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                arr[i][j] = 1
                wall(cnt + 1)
                arr[i][j] = 0


def bfs():
    q = deque()
    a = copy.deepcopy(arr)
    for i in range(n):
        for j in range(m):
            if a[i][j] == 2:
                q.append((i, j))

    while q:
        r, c = q.popleft()
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]

            if 0 <= nr < n and 0 <= nc < m:
                if a[nr][nc] == 0:
                    a[nr][nc] = 2
                    q.append((nr, nc))

    global ans
    cnt = 0
    for i in range(n):
        for j in range(m):
            if a[i][j] == 0:
                cnt += 1
    ans = max(ans, cnt)


n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = 0
wall(0)
print(ans)
