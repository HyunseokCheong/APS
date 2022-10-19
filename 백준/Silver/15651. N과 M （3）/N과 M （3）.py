def solve(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        arr[depth] = i + 1
        solve(depth + 1)


m, n = map(int, input().split())
arr = [0] * n

solve(0)