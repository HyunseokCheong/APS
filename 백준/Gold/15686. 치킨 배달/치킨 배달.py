from itertools import combinations
import sys

input = sys.stdin.readline
n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

mnv = 1e9
house = []
chick = []

for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            house.append([i, j])
        elif arr[i][j] == 2:
            chick.append([i, j])

for i in combinations(chick, m):
    res = 0
    for j in house:
        dist_chick = 1e9
        for k in range(m):
            dist_chick = min(dist_chick, abs(j[0] - i[k][0]) + abs(j[1] - i[k][1]))
        res += dist_chick
    mnv = min(mnv, res)

print(mnv)
