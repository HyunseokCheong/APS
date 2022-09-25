def dfs(idx, depth):
    global mnv
    if depth == n // 2:
        s1, s2 = 0, 0
        for i in range(n - 1):
            for j in range(i + 1, n):
                if visited[i] and visited[j]:
                    s1 += arr[i][j] + arr[j][i]
                elif not visited[i] and not visited[j]:
                    s2 += arr[i][j] + arr[j][i]
        mnv = min(mnv, abs(s1 - s2))
    for i in range(idx, n):
        if not visited[i]:
            visited[i] = 1
            dfs(i + 1, depth + 1)
            visited[i] = 0


t = int(input())
for tc in range(t):
    n = int(input())
    arr = [list(map(int, input().split())) for _ in range(n)]
    visited = [0] * n
    mnv = 1e9
    dfs(0, 0)
    print(f'#{tc + 1} {mnv}')