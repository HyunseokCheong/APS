import sys

sys.stdin = open('A-02.txt')

# 상 하 좌 우
dr = [1, -1, 0, 0]
dc = [0, 0, -1, 1]

for tc in range(int(input())):
    N = int(input())
    board = [list(map(int, input().split())) for _ in range(N)]

    # 가장자리에 있는지 체크 9로 표시해서 아예 통과못하는 취급
    for row in range(N):
        if board[row][0] == 1:
            board[row][0] = 9
        if board[row][-1] == 1:
            board[row][-1] = 9
    for col in range(N):
        if board[0][col] == 1:
            board[0][col] = 9
        if board[-1][col] == 1:
            board[-1][col] = 9

    for row in range(N):
        for col in range(N):
            if board[row][col] == 1:
                direction = 0
                row += dr[direction]
                col += dc[direction]
                if row < 0 or col < 0 or row > N or col > N or board[row][col] != 0:
                    row -= dr[direction]
                    col -= dc[direction]
                    direction = (direction + 1) % 4
                board[row][col] = 2

    cnt = 0
    for row in range(N):
        for col in range(N):
            if board[row][col] == 2:
                cnt += 1

    print(f'#{tc + 1} {cnt}')