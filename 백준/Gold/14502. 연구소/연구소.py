from collections import deque


def make_wall(count):  # make wall
    if count == 3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if board[i][j] == 0:
                board[i][j] = 1
                make_wall(count + 1)
                board[i][j] = 0


def bfs():
    q = deque()
    copy_board = [x[:] for x in board]
    for i in range(n):
        for j in range(m):
            if copy_board[i][j] == 2:
                q.append((i, j))

    while q:
        r, c = q.popleft()
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]

            if 0 <= nr < n and 0 <= nc < m:
                if copy_board[nr][nc] == 0:
                    copy_board[nr][nc] = 2
                    q.append((nr, nc))

    global answer
    count = 0
    for i in range(n):
        for j in range(m):
            if copy_board[i][j] == 0:
                count += 1
    answer = max(answer, count)


n, m = map(int, input().split())
board = [list(map(int, input().split())) for _ in range(n)]
dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]
answer = 0
make_wall(0)  # count
print(answer)