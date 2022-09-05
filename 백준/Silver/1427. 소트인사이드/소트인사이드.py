N = input()
arr = []

for i in N:
    arr.append(i)

arr.sort(reverse=True)

for i in arr:
    print(i, end='')