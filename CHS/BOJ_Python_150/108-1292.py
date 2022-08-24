A, B = map(int, input().split())
arr = []
for i in range(B + 1):
    for j in range(i):
        if len(arr) == B:
            break
        arr.append(i)
print(sum(arr[A - 1:B]))