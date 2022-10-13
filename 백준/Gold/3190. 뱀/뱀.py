from collections import deque
import sys

input = sys.stdin.readline
n = int(input())
k = int(input())
arr = [[0] * n for _ in range(n)]

dr = [0, 1, 0, -1]
dc = [1, 0, -1, 0]

for i in range(k):
    r, c = map(int, input().split())
    arr[r - 1][c - 1] = 2

l = int(input())
dirDict = dict()
q = deque()
q.append((0, 0))

for i in range(l):
    x, c = input().split()
    dirDict[int(x)] = c

r, c = 0, 0
arr[r][c] = 1
cnt = 0
drt = 0


def turn(x):
    global drt
    if x == 'L':
        drt = (drt - 1) % 4
    elif x == 'D':
        drt = (drt + 1) % 4


while True:
    cnt += 1
    r += dr[drt]
    c += dc[drt]

    if r < 0 or r >= n or c < 0 or c >= n:
        break

    if arr[r][c] == 2:
        arr[r][c] = 1
        q.append((r, c))
        if cnt in dirDict:
            turn(dirDict[cnt])

    elif arr[r][c] == 0:
        arr[r][c] = 1
        q.append((r, c))
        nr, nc = q.popleft()
        arr[nr][nc] = 0
        if cnt in dirDict:
            turn(dirDict[cnt])

    else:
        break

print(cnt)
