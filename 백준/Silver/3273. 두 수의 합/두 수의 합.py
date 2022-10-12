'''
1 <= n <= 100000
1 <= x <= 2000000
'''
import sys

input = sys.stdin.readline

n = int(input())
arr = sorted(list(map(int, input().split())))
x = int(input())

s, e = 0, n - 1
cnt = 0

while s < e:
    res = arr[s] + arr[e]
    if res == x:
        cnt += 1
    if res < x:
        s += 1
        continue
    e -= 1
print(cnt)
