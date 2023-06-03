def recur(depth):
    if depth == m:
        print(*arr)
        return
    for i in range(n):
        if vis[i]:
            continue
        arr[depth] = i + 1
        vis[i] = True
        recur(depth + 1)
        vis[i] = False


# m자리 n진수
n, m = map(int, input().split())
arr = [0] * m
vis = [False] * n

recur(0)
