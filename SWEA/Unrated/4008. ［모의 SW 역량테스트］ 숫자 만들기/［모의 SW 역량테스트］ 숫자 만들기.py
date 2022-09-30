def dfs(depth, value):
    global mnv, mxv
    if depth == n:
        mnv = min(mnv, value)
        mxv = max(mxv, value)
        return
    res = num[depth]
    calc = [value + res, value - res, value * res, int(value / res)]
    for i in range(4):
        if opr[i] > 0:
            opr[i] -= 1
            dfs(depth + 1, calc[i])
            opr[i] += 1


t = int(input())
for tc in range(t):
    n = int(input())
    opr = list(map(int, input().split()))
    num = list(map(int, input().split()))

    mnv = 1e9
    mxv = -1e9

    dfs(1, num[0])
    print(f'#{tc + 1} {mxv - mnv}')
