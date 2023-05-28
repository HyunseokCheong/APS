n = int(input())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())

arr.sort(reverse=True)
mxv = -1e9
for i in range(n):
    mxv = max(mxv, arr[i] * (i + 1))

print(mxv)
