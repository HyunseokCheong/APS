import sys

input = sys.stdin.readline

# input
n, k = map(int, input().split())

arr = [0] * 1000001
for i in range(n):
    l, r = map(int, input().split())
    arr[l] += 1
    arr[r] -= 1
for i in range(1000000):
    arr[i + 1] += arr[i]

# implement
res = 0
s, e = 0, 0
while e < 1000001:
    res += arr[e]
    e += 1
    while res > k:
        res -= arr[s]
        s += 1
    if res == k:
        print(s, e)
        exit()

# output
print(0, 0)
