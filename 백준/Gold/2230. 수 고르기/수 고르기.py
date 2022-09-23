import sys

n, m = map(int, input().split())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())
arr.sort()
left, right = 0, 1
mnv = sys.maxsize

while left < n and right < n:
    res = arr[right] - arr[left]
    if res == m:
        print(res)
        exit()
    if res < m:
        right += 1
        continue
    left += 1
    mnv = min(mnv, res)
print(mnv)
