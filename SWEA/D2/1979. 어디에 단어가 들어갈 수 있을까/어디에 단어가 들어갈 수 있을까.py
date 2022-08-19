for tc in range(int(input())):
    N, K = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    cnt = 0
    # 가로
    for i in range(0, N):
        row = 0
        for j in range(0, N):
            if board[i][j] == 1:
                row += 1
            elif board[i][j] == 0 and row == K:
                cnt += 1
                row = 0
            elif board[i][j] == 0:
                row = 0
        if row == K:
            cnt += 1

    # 세로
    for i in range(0, N):
        column = 0
        for j in range(0, N):
            if board[j][i] == 1:
                column += 1
            elif board[j][i] == 0 and column == K:
                cnt += 1
                column = 0
            elif board[j][i] == 0:
                column = 0
        if column == K:
            cnt += 1

    print(f'#{tc + 1} {cnt}')