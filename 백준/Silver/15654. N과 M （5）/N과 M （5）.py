import sys

input = sys.stdin.readline


def solve(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        if vis[i] == 1:
            continue
        arr[depth] = lst[i]
        vis[i] = 1
        solve(depth + 1)
        vis[i] = 0


m, n = map(int, input().split())
lst = sorted(list(map(int, input().split())))
arr = [0] * n
vis = [0] * m

solve(0)
