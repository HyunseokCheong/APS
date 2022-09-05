N = int(input())
arr = []
for i in range(N):
    arr.append(input()[0])

temp = []
for i in arr:
    if arr.count(i) >= 5 and i not in temp:
        temp.append(i)

if not temp:
    print('PREDAJA')
else:
    temp.sort()
    for i in temp:
        print(i, end='')