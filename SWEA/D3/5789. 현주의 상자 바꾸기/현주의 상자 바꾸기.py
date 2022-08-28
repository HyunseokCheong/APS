for tc in range(int(input())):
    N, Q = map(int, input().split())

    mat = [0] * N

    for i in range(Q):
        L, R = map(int, input().split())

        for j in range(L - 1, R):
            mat[j] = i + 1

    print(f'#{tc + 1}', *mat)