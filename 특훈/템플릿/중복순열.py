def recur(depth):
    if depth == n:
        print(*arr)
        return
    for i in range(m):
        arr[depth] = i + 1
        recur(depth + 1)


n, m = map(int, input().split())  # 2 3
arr = [0] * n
recur(0)

# 1 1
# 1 2
# 1 3
# 2 1
# 2 2
# 2 3
# 3 1
# 3 2
# 3 3
