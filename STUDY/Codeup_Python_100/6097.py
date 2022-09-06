import sys

input = sys.stdin.readline

# 문제 입력
H, W = map(int, input().split())
N = int(input())

# 빈 판 입력
board = []
for i in range(H):
    board.append([0] * W)

# 막대 입력
for i in range(N):
    L, D, X, Y = map(int, input().split())
    for j in range(L):
        if D == 0:
            board[X - 1][Y - 1 + j] = 1
        else:
            board[X - 1 + j][Y - 1] = 1

# 출력
for i in board:
    print(*i)