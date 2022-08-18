# 우 하 좌 상
dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

for tc in range(int(input())):
    N = int(input())

    board = [[0] * N for _ in range(N)]
    direction = 0
    row = 0
    column = 0

    for i in range(1, N ** 2 + 1):
        board[row][column] = i
        row += dr[direction]
        column += dc[direction]

        if row < 0 or column < 0 or row >= N or column >= N or board[row][column] != 0:
            row -= dr[direction]
            column -= dc[direction]
            direction = (direction + 1) % 4
            row += dr[direction]
            column += dc[direction]
    
    print(f'#{tc + 1}')
    for i in board:
        print(*i)