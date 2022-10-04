k, n = map(int, input().split())
arr = [0] * k
for i in range(k):
    arr[i] = int(input())

s, e = 1, max(arr)
while s <= e:
    m = (s + e) // 2
    cnt = 0
    for i in range(k):
        cnt += arr[i] // m
    if cnt >= n:
        s = m + 1
    else:
        e = m - 1
print(e)
