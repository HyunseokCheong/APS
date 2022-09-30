from collections import deque


def check(y, x, idx):
    return 0 <= y < n and 0 <= x < m and arr[y][x] and visited[y][x] == 0 and rev[idx] in pipe[arr[y][x]]


def bfs():
    while q:
        r, c = q.popleft()
        for i in pipe[arr[r][c]]:
            nr = r + dr[i]
            nc = c + dc[i]
            if check(nr, nc, i):
                q.append((nr, nc))
                visited[nr][nc] = visited[r][c] + 1
    cnt = 0
    for i in range(n):
        for j in range(m):
            if visited[i][j] and visited[i][j] <= l:
                cnt += 1
    return cnt


dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]
rev = [1, 0, 3, 2]

pipe = [[], [0, 1, 2, 3], [0, 1], [2, 3], [0, 3], [1, 3], [1, 2], [0, 2]]

t = int(input())
for tc in range(t):
    n, m, r, c, l = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]
    visited = [[0] * m for _ in range(n)]
    q = deque()
    q.append((r, c))
    visited[r][c] = 1
    ans = bfs()
    print(f'#{tc + 1} {ans}')
