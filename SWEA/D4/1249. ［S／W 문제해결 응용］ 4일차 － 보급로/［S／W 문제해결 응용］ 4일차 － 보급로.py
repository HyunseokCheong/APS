from collections import deque

dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]

t = int(input())
for tc in range(t):
    n = int(input())
    arr = [list(map(int, input())) for _ in range(n)]

    dist = [[1e9] * n for _ in range(n)]
    dist[0][0] = 0
    q = deque()
    q.append((0, 0))

    while q:
        r, c = q.popleft()
        for di in range(4):
            nr = r + dr[di]
            nc = c + dc[di]
            if 0 <= nr < n and 0 <= nc < n and dist[nr][nc] > dist[r][c] + arr[nr][nc]:
                dist[nr][nc] = dist[r][c] + arr[nr][nc]
                q.append((nr, nc))

    ans = dist[n - 1][n - 1]
    print(f'#{tc + 1} {ans}')