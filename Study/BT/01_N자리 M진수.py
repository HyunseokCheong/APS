def solve(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        arr[depth] = i
        solve(depth + 1)


n, m = map(int, input().split())
arr = [0] * n

solve(0)