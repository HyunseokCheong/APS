dr = [1, -1, 0, 0, 1, -1, 1, -1]
dc = [0, 0, -1, 1, 1, 1, -1, -1]

t = int(input())
for tc in range(t):
    n, m = map(int, input().split())
    arr = [[0] * n for _ in range(n)]

    mid = n // 2
    arr[mid][mid] = 2
    arr[mid - 1][mid - 1] = 2
    arr[mid - 1][mid] = 1
    arr[mid][mid - 1] = 1

    for i in range(m):
        c, r, d = map(int, input().split())
        c, r = c - 1, r - 1
        arr[r][c] = d

        target = []

        for j in range(8):
            nr, nc = r + dr[j], c + dc[j]
            while True:
                if nr < 0 or nc < 0 or nr > n - 1 or nc > n - 1:
                    target = []
                    break
                elif arr[nr][nc] == 0:
                    target = []
                    break
                elif arr[nr][nc] == d:
                    break
                target.append((nr, nc))
                nr, nc = nr + dr[j], nc + dc[j]
            for k in target:
                arr[k[0]][k[1]] = d
    b = w = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j] == 1:
                b += 1
            elif arr[i][j] == 2:
                w += 1
    print('#{} {} {}'.format(tc + 1, b, w))
