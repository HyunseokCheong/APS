dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

t = int(input())
for tc in range(t):
    n = int(input())
    arr = [[0] * n for _ in range(n)]
    di = 0
    r = 0
    c = 0
    for i in range(1, n ** 2 + 1):
        arr[r][c] = i
        nr = r + dr[di]
        nc = c + dc[di]
        if 0 <= nr < n and 0 <= nc < n and arr[nr][nc] == 0:
            r = nr
            c = nc
        else:
            di = (di + 1) % 4
            r += dr[di]
            c += dc[di]
    print(f'#{tc + 1}')
    for i in range(n):
        for j in range(n):
            print(arr[i][j], end=' ')
        print()