import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
x = int(input())

arr.sort()
s, e, m, cnt = 0, n - 1, 0, 0

while s < e:
    m = arr[s] + arr[e]
    if m == x:
        cnt += 1
    if m <= x:
        s += 1
    else:
        e -= 1

print(cnt)
