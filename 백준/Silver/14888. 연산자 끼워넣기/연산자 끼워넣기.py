import sys

input = sys.stdin.readline


def dfs(depth, value):
    global mxv, mnv
    if depth == n:
        mxv = max(mxv, value)
        mnv = min(mnv, value)
        return
    res = arr[depth]
    calc = [value + res, value - res, value * res, int(value / res)]
    for i in range(4):
        if op[i] > 0:
            op[i] -= 1
            dfs(depth + 1, calc[i])
            op[i] += 1


n = int(input())
arr = list(map(int, input().split()))
# + - * /
op = list(map(int, input().split()))

mxv = -1e10
mnv = 1e10

dfs(1, arr[0])

print(mxv, mnv, sep='\n')