def recur(cur):
    if cur == N:
        print(*arr)
        return
    for i in range(M):
        arr[cur] = i + 1
        recur(cur + 1)


M, N = map(int, input().split())
arr = [0 for i in range(N)]
recur(0)
