from collections import deque

li = []
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]


def bfs(r, c):
    count = 1
    q = deque()
    q.append((r, c))
    v[r][c] = True

    while q:
        r, c = q.popleft()

        for i in range(4):
            nr, nc = r + dr[i], c + dc[i]

            if nr < 0 or nr >= n or nc < 0 or nc >= n:
                continue

            if v[nr][nc] or g[nr][nc] == 0:
                continue

            q.append((nr, nc))
            v[nr][nc] = True
            count += 1

    li.append(count)


n = int(input())
g = [list(map(int, input())) for _ in range(n)]
v = [[False] * n for _ in range(n)]

for row in range(n):
    for col in range(n):
        if not v[row][col] and g[row][col] == 1:
            bfs(row, col)

print(len(li))
li.sort()
for i in li:
    print(i)
