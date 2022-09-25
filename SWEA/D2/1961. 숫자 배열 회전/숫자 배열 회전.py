t = int(input())
for tc in range(t):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    print(f'#{tc + 1}')
    for i in range(n):
        for j in range(n):
            print(arr[n - 1 - j][i], end='')
        print(end=' ')
        for j in range(n):
            print(arr[n - 1 - i][n - 1 - j], end='')
        print(end=' ')
        for j in range(n):
            print(arr[j][n - 1 - i], end='')
        print()