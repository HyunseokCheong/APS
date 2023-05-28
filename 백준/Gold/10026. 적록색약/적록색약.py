import sys

input = sys.stdin.readline
sys.setrecursionlimit(10000)


def dfs_1(r, c):
    vis_1[r][c] = 1
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if 0 <= nr and 0 <= nc and nr < n and nc < n and vis_1[nr][nc] == 0:
            if arr[r][c] == arr[nr][nc]:
                dfs_1(nr, nc)


def dfs_2(r, c):
    vis_2[r][c] = 1
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        if 0 <= nr and 0 <= nc and nr < n and nc < n and vis_2[nr][nc] == 0:
            if arr[r][c] == arr[nr][nc]:
                dfs_2(nr, nc)


dr = [-1, 1, 0, 0]
dc = [0, 0, -1, 1]

n = int(input())
arr = [list(input()) for _ in range(n)]
vis_1 = [[0] * n for _ in range(n)]
cnt_1 = 0
for row in range(n):
    for col in range(n):
        if vis_1[row][col] == 0:
            dfs_1(row, col)
            cnt_1 += 1

# 변환
for row in range(n):
    for col in range(n):
        if arr[row][col] == 'R':
            arr[row][col] = 'G'

vis_2 = [[0] * n for _ in range(n)]
cnt_2 = 0
for row in range(n):
    for col in range(n):
        if vis_2[row][col] == 0:
            dfs_2(row, col)
            cnt_2 += 1

print(cnt_1, cnt_2)
