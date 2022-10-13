import sys

input = sys.stdin.readline
n, k = map(int, input().split())
arr = list(map(int, input().split()))

e = 0
res = 0
tmp = 0
cnt = 0

for s in range(n):
    while cnt <= k and e < n:
        if arr[e] % 2 == 1:
            cnt += 1
        elif arr[e] % 2 == 0:
            tmp += 1
        e += 1
        if s == 0 and e == n:
            res = tmp
            break
    if cnt == k + 1:
        res = max(tmp, res)

    if arr[s] % 2 == 1:
        cnt -= 1
    elif arr[s] % 2 == 0:
        tmp -= 1

print(res)
