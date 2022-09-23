def solve(t, p):
    global mxv
    if t >= n:
        if p > mxv:
            mxv = p
        return
    if t + arr[t][0] <= n:
        solve(t + arr[t][0], p + arr[t][1])
    solve(t + 1, p)


n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]

mxv = 0
solve(0, 0)
print(mxv)
