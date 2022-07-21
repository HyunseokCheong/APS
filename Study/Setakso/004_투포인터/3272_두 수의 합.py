n = int(input())
arr = list(map(int, input().split()))
x = int(input())
arr.sort()
L, R = 0, n - 1
res = 0
while L < R:
    temp = arr[L] + arr[R]
    if temp == x:
        res += 1
    if temp < x:
        L += 1
        continue
    R -= 1
print(res)
