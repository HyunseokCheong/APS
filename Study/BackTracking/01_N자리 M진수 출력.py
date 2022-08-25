def recur(cur):
    if cur == N:
        print(*arr)
        return
    for i in range(M):
        arr[cur] = i
        recur(cur + 1)


N, M = map(int, input().split())
arr = [0 for i in range(N)]
recur(0)
