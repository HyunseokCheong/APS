def dfs(v):
    global ans
    if v == e:
        ans = 1
        return
    visited[v] = 1
    for idx in graph[v]:
        if not visited[idx]:
            dfs(idx)


for _ in range(10):
    tc, n = map(int, input().split())
    arr = list(map(int, input().split()))
    graph = [[] for _ in range(100)]
    for i in range(0, len(arr), 2):
        graph[arr[i]].append(arr[i + 1])
    s, e = 0, 99
    visited = [0] * 100
    ans = 0
    dfs(s)
    print(f'#{tc} {ans}')
