import sys

sys.stdin = open('02_사각영역들의 합.txt')
for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for i in range(N)]

    empty_board = [[0] * N for i in range(N)]
    answer = 0

    for i in range(M):
        row, col, length = map(int, input().split())
        result = 0
        for r in range(length):
            for c in range(length):
                if row + r < N and col + c < N:
                    if empty_board[row + r][col + c] == 0:
                        result += board[row + r][col + c]
                        empty_board[row + r][col + c] = 1
        answer += result

    print(f'#{tc + 1} {answer}')