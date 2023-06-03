def recur(depth):
    if depth == m:
        print(*arr)
        return
    for i in range(n):
        arr[depth] = i + 1
        recur(depth + 1)


n, m = map(int, input().split())
arr = [0] * m
recur(0)
