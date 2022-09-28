def bfs(x):
    # 큐생성 + 시작점 인큐
    q = [1]
    # visited 생성
    visited = [0] * (x + 1)
    # 시작점 방문표시
    visited[1] = 1
    # 큐가 빌때까지 반복
    while q:
        v = q.pop(0)
        if visited[v] > 3:
            break
        for i in range(1, x + 1):
            if arr[v][i] == 1 and visited[i] == 0:
                q.append(i)
                visited[i] = visited[v] + 1
    cnt = 0
    for i in range(1, x + 1):
        if 1 < visited[i] < 4:
            cnt += 1
    return cnt


t = int(input())
for tc in range(t):
    n, m = map(int, input().split())
    arr = [[0] * (n + 1) for _ in range(n + 1)]
    for _ in range(m):
        a, b = map(int, input().split())
        arr[a][b] = 1
        arr[b][a] = 1
    ans = bfs(n)
    print(f'#{tc + 1} {ans}')
