def dfs(depth, value):
    global mnv
    if value >= b:
        mnv = min(mnv, value)
        return
    for i in range(depth, n):
        if visited[i] == 0 and value + arr[i] < mnv:
            visited[i] = 1
            dfs(i + 1, value + arr[i])
            visited[i] = 0


t = int(input())
for tc in range(t):
    n, b = map(int, input().split())
    arr = list(map(int, input().split()))
    visited = [0] * (n + 1)
    mnv = 1e9
    dfs(0, 0)
    print(f'#{tc + 1} {mnv - b}')