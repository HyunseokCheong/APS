def dfs(depth, value):
    global mxv
    if depth == n:
        if value > mxv:
            mxv = value
        return
    if value <= mxv:
        return
    for i in range(n):
        if visited[i] == 0:
            visited[i] = 1
            dfs(depth + 1, value * arr[depth][i] / 100)
            visited[i] = 0


t = int(input())
for tc in range(t):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    mxv = 0
    visited = [0] * n

    dfs(0, 1)
    print(f'#{tc + 1} {mxv * 100:.6f}')