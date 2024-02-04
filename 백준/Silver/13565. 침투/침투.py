import sys

sys.setrecursionlimit(3000000)


def dfs(row: int, col: int) -> None:
    if row == m - 1:
        print("YES")
        sys.exit()
    board[row][col] = 1
    for dr, dc in d:
        nr = row + dr
        nc = col + dc

        if nr < 0 or nr >= m or nc < 0 or nc >= n:
            continue
        if board[nr][nc] != 0:
            continue
        dfs(nr, nc)


m, n = map(int, input().split())
board = [list(map(int, input())) for _ in range(m)]
d = [[-1, 0], [1, 0], [0, -1], [0, 1]]

for i in range(n):
    if board[0][i] == 0:
        dfs(0, i)

print("NO")