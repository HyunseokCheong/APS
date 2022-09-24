t = int(input())
for tc in range(t):
    n = int(input())
    arr = [[1]]
    for i in range(1, n):
        arr.append([1])
        for j in range(1, i):
            arr[i].append(arr[i - 1][j - 1] + arr[i - 1][j])
        arr[i].append(1)
    print(f'#{tc + 1}')
    for i in range(n):
        for j in range(i + 1):
            print(arr[i][j], end=' ')
        print()