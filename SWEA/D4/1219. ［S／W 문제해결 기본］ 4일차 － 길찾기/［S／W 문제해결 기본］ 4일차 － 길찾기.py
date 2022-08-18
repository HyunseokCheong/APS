def dfs(v):
    visited[v] = 1
    for w in G[v]:
        if visited[w] == 0:
            dfs(w)

for _ in range(10):
    V = 100
    tc, E = map(int, input().split())
    path_list = list(map(int, input().split()))
    G = [[0] for _ in range(V + 1)]
    visited = [0] * (V + 1)

    for i in range(E):
        start, end = path_list[2 * i], path_list[2 * i + 1]
        G[start].append(end)

    print(f'#{tc}', end=' ')
    dfs(0)
    if visited[99] == 1:
        print(1)
    else:
        print(0)