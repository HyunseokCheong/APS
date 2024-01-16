from collections import deque

DR = [2, 1, -1, -2, -2, -1, 1, 2]
DC = [1, 2, 2, 1, -1, -2, -2, -1]

t = int(input())
for _ in range(t):
    l = int(input())
    cr, cc = map(int, input().split())
    tr, tc = map(int, input().split())

    result = 1e9
    queue = deque()
    visited = [[False] * l for i in range(l)]

    queue.append([cr, cc, 0])
    visited[cr][cc] = True

    while queue:
        cr, cc, cd = queue.popleft()

        if cr == tr and cc == tc:
            result = min(result, cd)
            continue

        for d in range(8):
            nr = cr + DR[d]
            nc = cc + DC[d]
            nd = cd + 1

            if nr < 0 or nr >= l or nc < 0 or nc >= l:
                continue
            if visited[nr][nc]:
                continue

            queue.append([nr, nc, nd])
            visited[nr][nc] = True

    print(result)