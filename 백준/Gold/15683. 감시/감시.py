import copy
import sys

input = sys.stdin.readline


def dfs(depth, arr):
    global ans
    a = copy.deepcopy(arr)
    if depth == len(cctv):
        cnt = 0
        for i in a:
            cnt += i.count(0)
        ans = min(ans, cnt)
        return

    r, c, t = cctv[depth]
    for i in di[t]:
        watch(r, c, i, a)
        dfs(depth + 1, a)
        a = copy.deepcopy(arr)


def watch(r, c, i, a):
    for d in i:
        nr, nc = r, c
        while True:
            nr = nr + dr[d]
            nc = nc + dc[d]
            if nr < 0 or nr >= n or nc < 0 or nc >= m or a[nr][nc] == 6:
                break
            elif a[nr][nc] == 0:
                a[nr][nc] = '#'


n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

dr = [-1, 0, 1, 0]
dc = [0, 1, 0, -1]
di = {
    1: [[0], [1], [2], [3]],
    2: [[0, 2], [1, 3]],
    3: [[0, 1], [1, 2], [2, 3], [3, 0]],
    4: [[0, 1, 2], [1, 2, 3], [2, 3, 0], [3, 0, 1]],
    5: [[0, 1, 2, 3]]
}

cctv = []
ans = 1e9

for i in range(n):
    for j in range(m):
        if arr[i][j] != 0 and arr[i][j] != 6:
            cctv.append([i, j, arr[i][j]])

dfs(0, arr)
print(ans)
