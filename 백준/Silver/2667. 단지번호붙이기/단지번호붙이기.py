def recur(cr: int, cc: int):
    global count
    count += 1
    for i in range(4):
        nr = cr + d[i][0]
        nc = cc + d[i][1]

        if nr < 0 or nr >= n or nc < 0 or nc >= n:
            continue
        if board[nr][nc] != 1 or visited[nr][nc]:
            continue

        visited[nr][nc] = True
        recur(nr, nc)


n = int(input())
board = [list(map(int, input())) for _ in range(n)]

d = [[-1, 0], [1, 0], [0, -1], [0, 1]]
visited = [[False] * n for _ in range(n)]
result = []

for r in range(n):
    for c in range(n):
        if board[r][c] == 1 and not visited[r][c]:
            count = 0
            visited[r][c] = True
            recur(r, c)
            result.append(count)

print(len(result))
result.sort()
for i in result:
    print(i)