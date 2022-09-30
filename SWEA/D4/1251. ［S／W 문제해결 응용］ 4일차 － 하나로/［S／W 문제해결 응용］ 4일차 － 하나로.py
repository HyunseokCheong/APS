def solve(x):
    global ans
    dst[x] = 0

    for _ in range(n):
        mni = -1
        mnv = float('inf')

        for i in range(n):
            if vis[i] == 0 and mnv > dst[i]:
                mni = i
                mnv = dst[i]

        vis[mni] = 1
        ans += mnv * e

        for i in range(n):
            if vis[i] == 0:
                dst[i] = min(dst[i], (c[mni] - c[i]) ** 2 + (r[mni] - r[i]) ** 2)


t = int(input())
for tc in range(t):
    n = int(input())
    c = list(map(int, input().split()))
    r = list(map(int, input().split()))
    e = float(input())

    vis = [0] * n
    dst = [float('inf')] * n
    ans = 0
    solve(0)

    print(f'#{tc + 1} {round(ans)}')
