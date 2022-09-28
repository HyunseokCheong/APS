import sys

input = sys.stdin.readline

n, m = map(int, input().split())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())
arr.sort()

mnv = sys.maxsize
s, e = 0, 1

while s < n and e < n:
    res = arr[e] - arr[s]

    if res == m:
        print(res)
        exit()

    elif res < m:
        e += 1

    elif res > m:
        mnv = min(mnv, res)
        s += 1

print(mnv)