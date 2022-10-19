def solve(depth, start):
    if depth == n:
        print(*arr)
        return
    for i in range(start, m):
        arr[depth] = lst[i]
        solve(depth + 1, i)


m, n = map(int, input().split())
lst = sorted(list(map(int, input().split())))
arr = [0] * n

solve(0, 0)
