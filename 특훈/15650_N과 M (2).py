def solve(depth, start):
    if depth == m:
        print(*arr)
        return
    for i in range(start, n):
        arr[depth] = i + 1
        solve(depth + 1, i + 1)


n, m = map(int, input().split())
arr = [0] * m
solve(0, 0)
