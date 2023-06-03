def recur(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        if vis[i]:
            continue
        arr[depth] = i + 1
        vis[i] = True
        recur(depth + 1)
        vis[i] = False


n, m = map(int, input().split())  # 2 3
arr = [0] * n
vis = [False] * m
recur(0)

# 1 2
# 1 3
# 2 1
# 2 3
# 3 1
# 3 2
