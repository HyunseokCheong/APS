t = int(input())
for tc in range(t):
    n, m = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]
    mxv = -1e9
    for i in range(n - m + 1):
        for j in range(n - m + 1):
            s = 0
            for k in range(m):
                for l in range(m):
                    s += arr[i + k][j + l]
            if s > mxv:
                mxv = s
    print(f'#{tc + 1} {mxv}')