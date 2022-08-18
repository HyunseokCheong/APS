for tc in range(int(input())):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]
    arr_90 = [[0 for _ in range(N)] for _ in range(N)]
    arr_180 = [[0 for _ in range(N)] for _ in range(N)]
    arr_270 = [[0 for _ in range(N)] for _ in range(N)]
    for i in range(N):
        for j in range(N):
            arr_90[i][j] = arr[N - 1 - j][i]
    for i in range(N):
        for j in range(N):
            arr_180[i][j] = arr_90[N - 1 - j][i]
    for i in range(N):
        for j in range(N):
            arr_270[i][j] = arr_180[N - 1 - j][i]

    print(f'#{tc + 1}')
    for i in range(N):
        for j in range(N):
            print(arr_90[i][j], end='')
        print(end=' ')
        for k in range(N):
            print(arr_180[i][k], end='')
        print(end=' ')
        for l in range(N):
            print(arr_270[i][l], end='')
        print()