def cost(x):
    return x ** 2 + (x - 1) ** 2


t = int(input())
for tc in range(t):
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]

    mxv = -1e9
    house = []
    for i in range(n):
        for j in range(n):
            if arr[i][j]:
                house.append((i, j))

    for k in range(1, n + 2):
        for i in range(n):
            for j in range(n):
                cnt = 0
                for x, y in house:
                    if abs(i - x) + abs(j - y) < k:
                        cnt += 1
                if cost(k) <= cnt * m and mxv < cnt:
                    mxv = cnt
    print(f'#{tc + 1} {mxv}')
