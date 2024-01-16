from collections import deque

DR = [-1, 1, 0, 0]
DC = [0, 0, -1, 1]

n = int(input())
board = [list(input()) for _ in range(n)]

count = 0
visited = [[False] * n for _ in range(n)]
queue = deque()

for r in range(n):
    for c in range(n):
        if not visited[r][c]:
            count += 1
            color = board[r][c]

            queue.append([r, c])
            visited[r][c] = True

            while queue:
                cr, cc = queue.popleft()
                for d in range(4):
                    nr = cr + DR[d]
                    nc = cc + DC[d]

                    if nr < 0 or nr >= n or nc < 0 or nc >= n:
                        continue
                    if visited[nr][nc]:
                        continue
                    if board[nr][nc] != color:
                        continue

                    visited[nr][nc] = True
                    queue.append([nr, nc])

print(count, end=" ")

for r in range(n):
    for c in range(n):
        if board[r][c] == "R":
            board[r][c] = "G"

count = 0
visited = [[False] * n for _ in range(n)]
queue = deque()

for r in range(n):
    for c in range(n):
        if not visited[r][c]:
            count += 1
            color = board[r][c]

            queue.append([r, c])
            visited[r][c] = True

            while queue:
                cr, cc = queue.popleft()
                for d in range(4):
                    nr = cr + DR[d]
                    nc = cc + DC[d]

                    if nr < 0 or nr >= n or nc < 0 or nc >= n:
                        continue
                    if visited[nr][nc]:
                        continue
                    if board[nr][nc] != color:
                        continue

                    visited[nr][nc] = True
                    queue.append([nr, nc])

print(count)