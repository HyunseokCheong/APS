from collections import deque

dr = [1, -1, 0, 0]
dc = [0, 0, 1, -1]
ans = 0

m, n = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

q = deque()
for i in range(n):
    for j in range(m):
        if arr[i][j] == 1:
            q.append((i, j))

while q:
    r, c = q.popleft()
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if 0 <= nr < n and 0 <= nc < m and arr[nr][nc] == 0:
            arr[nr][nc] = arr[r][c] + 1
            q.append((nr, nc))

for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            print(-1)
            exit()
    ans = max(ans, max(arr[i]))
print(ans - 1)
