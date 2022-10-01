def iswall(x, y):
    return x == 0 or x == n - 1 or y == 0 or y == n - 1


def solve():
    global arr
    for i in range(len(arr)):
        arr[i][0] += dr[arr[i][3]]
        arr[i][1] += dc[arr[i][3]]
        if iswall(arr[i][0], arr[i][1]):
            arr[i][2] //= 2
            arr[i][3] = rev[arr[i][3]]


def merge():
    global arr
    arr.sort(key=lambda x: (x[0], x[1], x[2]), reverse=True)
    idx = 1
    while idx < len(arr):
        if arr[idx - 1][0:2] == arr[idx][0:2]:
            arr[idx - 1][2] += arr[idx][2]
            arr.pop(idx)
        else:
            idx += 1


dr = [0, -1, 1, 0, 0]
dc = [0, 0, 0, -1, 1]
rev = [0, 2, 1, 4, 3]

t = int(input())
for tc in range(t):
    n, m, k = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(k)]

    for _ in range(m):
        solve()
        merge()

    print(f'#{tc + 1} {sum([i[2] for i in arr])}')