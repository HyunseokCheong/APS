def dfs(depth, value):
    global cnt
    if depth >= n:
        return
    if value + arr[depth] == k:
        cnt += 1
    dfs(depth + 1, value)
    dfs(depth + 1, value + arr[depth])


t = int(input())
for tc in range(t):
    n, k = map(int, input().split())
    arr = list(map(int, input().split()))
    cnt = 0
    dfs(0, 0)
    print(f'#{tc + 1} {cnt}')