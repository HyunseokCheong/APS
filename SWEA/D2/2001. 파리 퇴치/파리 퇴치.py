for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    max_value = 0

    for i in range(0, N - M + 1):
        for j in range(0, N - M + 1):

            value = 0
            for k in range(i, i + M):
                for l in range(j, j + M):
                    value += board[k][l]

            if value > max_value:
                max_value = value

    print(f'#{tc + 1} {max_value}')