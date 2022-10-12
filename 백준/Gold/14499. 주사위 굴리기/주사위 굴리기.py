import sys

input = sys.stdin.readline


def move(di):
    if di == 1:
        dice[1], dice[3], dice[4], dice[6] = dice[3], dice[6], dice[1], dice[4]
    elif di == 2:
        dice[1], dice[3], dice[4], dice[6] = dice[4], dice[1], dice[6], dice[3]
    elif di == 3:
        dice[1], dice[2], dice[5], dice[6] = dice[2], dice[6], dice[1], dice[5]
    elif di == 4:
        dice[1], dice[2], dice[5], dice[6] = dice[5], dice[1], dice[6], dice[2]


n, m, r, c, k = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
dice = [0, 0, 0, 0, 0, 0, 0]
odr = list(map(int, input().split()))

dr = [0, 0, 0, -1, 1]
dc = [0, 1, -1, 0, 0]

for i in odr:
    nr = dr[i]
    nc = dc[i]
    if 0 <= r + nr < n and 0 <= c + nc < m:
        r += nr
        c += nc
        move(i)
        if arr[r][c] == 0:
            arr[r][c] = dice[1]
        else:
            dice[1] = arr[r][c]
            arr[r][c] = 0
        print(dice[6])
