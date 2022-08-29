for tc in range(int(input())):
    N, M = map(int, input().split())
    board = [list(map(int, input().split())) for _ in range(N)]

    maxV = -1e9
    for row in range(N):
        cnt = 0
        for col in range(M):
            if board[row][col]:
                cnt += 1
                if maxV < cnt:
                    maxV = cnt
            else:
                cnt = 0
    for col in range(M):
        cnt = 0
        for row in range(N):
            if board[row][col]:
                cnt += 1
                if maxV < cnt:
                    maxV = cnt
            else:
                cnt = 0

    print(f'#{tc + 1} {maxV}')