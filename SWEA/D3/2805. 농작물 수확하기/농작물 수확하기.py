for tc in range(int(input())):
    N = int(input())
    board = [list(input()) for _ in range(N)]

    M = N // 2
    S = E = M
    ans = 0

    for i in range(N):
        for j in range(S, E + 1):
            ans += int(board[i][j])
        if i < M:
            S -= 1
            E += 1
        else:
            S += 1
            E -= 1

    print(f'#{tc + 1} {ans}')