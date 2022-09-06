N = int(input())

maxLen = 0
maxArr = []
for i in range(N + 1):
    arr = [N, i]
    j = 0
    while True:
        lastNum = arr[j] - arr[j + 1]
        j += 1
        if lastNum < 0:
            break
        arr.append(lastNum)
        if len(arr) > maxLen:
            maxLen = len(arr)
            maxArr = arr
print(maxLen)
print(*maxArr)
