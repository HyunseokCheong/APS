import sys

sys.stdin = open('A-01.txt')
for tc in range(int(input())):
    board = [[0] * 31 for _ in range(31)]
    N = int(input())
    for i in range(N):
        C, R, L = map(int, input().split())
        C += 15
        R += 15

        board[R][C] -= 1
        for col in range(C - L, C + L + 1):
            if 0 <= col <= 30:
                board[R][col] += 1

        for row in range(R - L, C + L + 1):
            if 0 <= row <= 30:
                board[C][row] += 1

    print(board)
