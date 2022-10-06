arr = [0] * 9
n = input()
for i in n:
    if i == '9':
        arr[6] += 1
    else:
        arr[int(i)] += 1
arr[6] = (arr[6] + 1) // 2
print(max(arr))
