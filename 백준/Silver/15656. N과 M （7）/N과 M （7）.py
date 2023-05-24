def solve(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        arr[depth] = lst[i]
        solve(depth + 1)


m, n = map(int, input().split())
lst = sorted(list(map(int, input().split())))
arr = [0] * n

solve(0)
