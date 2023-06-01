mxv = -1e9
mxi = []

arr = [0] * 9
for i in range(9):
    arr[i] = list(map(int, input().split()))
    if max(arr[i]) > mxv:
        mxv = max(arr[i])
        mxi = [i + 1, arr[i].index(max(arr[i])) + 1]

print(mxv)
print(*mxi)