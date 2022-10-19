def solve(depth, start):
    if depth == n:
        print(*arr)
        return
    for i in range(start, m):
        arr[depth] = i
        solve(depth + 1, i + 1)


n, m = map(int, input().split())
arr = [0] * n

solve(0, 0)
