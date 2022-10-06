from collections import deque
import sys

input = sys.stdin.readline


def solve(cnt):
    global arr, ans
    if cnt == 5:
        for i in range(n):
            ans = max(ans, max(arr[i]))
        return

    a = [x[:] for x in arr]

    for k in range(4):
        move(k)
        solve(cnt + 1)
        arr = [x[:] for x in a]


def get(r, c):
    if arr[r][c] != 0:
        q.append(arr[r][c])
        arr[r][c] = 0


def merge(r, c, dr, dc):
    while q:
        x = q.popleft()
        if arr[r][c] == 0:
            arr[r][c] = x
        elif arr[r][c] == x:
            arr[r][c] = x * 2
            r, c = r + dr, c + dc
        else:
            r, c = r + dr, c + dc
            arr[r][c] = x


def move(k):
    if k == 0:
        for j in range(n):
            for i in range(n):
                get(i, j)
            merge(0, j, 1, 0)
    elif k == 1:
        for j in range(n):
            for i in range(n - 1, -1, -1):
                get(i, j)
            merge(n - 1, j, -1, 0)
    elif k == 2:
        for i in range(n):
            for j in range(n):
                get(i, j)
            merge(i, 0, 0, 1)
    else:
        for i in range(n):
            for j in range(n - 1, -1, -1):
                get(i, j)
            merge(i, n - 1, 0, -1)


n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
ans = 0
q = deque()
solve(0)
print(ans)
