import sys

input = sys.stdin.readline

# 기본 바둑판 생성
board = []
for i in range(19):
    board.append([])
    for j in range(19):
        board[i].append(0)

# 바둑판 입력
for i in range(19):
    board[i] = list(map(int, input().split()))

# 바꿀 횟수 입력
N = int(input())

# 바꿀 좌표 입력
for i in range(N):
    X, Y = map(int, input().split())
    # 뒤집기
    for j in range(19):
        if board[j][Y - 1] == 0:
            board[j][Y - 1] = 1
        else:
            board[j][Y - 1] = 0
        if board[X - 1][j] == 0:
            board[X - 1][j] = 1
        else:
            board[X - 1][j] = 0
for i in board:
    print(*i)
