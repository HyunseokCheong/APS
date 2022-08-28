for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    max_val = 0
    for row in range(0, N - M + 1):
        for col in range(0, N - M + 1):
            res = 0
            for i in range(row, row + M):
                for k in range(col, col + M):
                    res += board[i][k]
            if res > max_val:
                max_val = res

    print(f'#{tc + 1} {max_val}')
