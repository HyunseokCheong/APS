import sys

input = sys.stdin.readline


def recur(i: int):
    global count, visited

    visited[i] = True
    for j in range(n + 1):
        if board[i][j] != 1 or visited[j]:
            continue
        count += 1
        recur(j)


n = int(input())
m = int(input())
board = [[0 for _ in range(n + 1)] for _ in range(n + 1)]
for _ in range(m):
    a, b = map(int, input().split())
    board[a][b] = 1
    board[b][a] = 1

count = 0
visited = [False for _ in range(n + 1)]
recur(1)

print(count)