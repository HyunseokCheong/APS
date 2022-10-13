import sys

input = sys.stdin.readline
n = int(input())
arr = sorted(list(map(int, input().split())))

s, e = 0, n - 1
mnv = sys.maxsize
ans = []

while s < e:
    res = arr[s] + arr[e]

    if res == 0:
        ans = [arr[s], arr[e]]
        break

    if abs(res) < mnv:
        mnv = abs(res)
        ans = [arr[s], arr[e]]

    if res < 0:
        s += 1
    else:
        e -= 1

print(*ans)
