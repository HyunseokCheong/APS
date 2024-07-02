arr = [-1] * 26
data = input()

for i in data:
    n = ord(i) - 97
    if arr[n] == -1:
        arr[n] = data.index(i)
print(*arr)