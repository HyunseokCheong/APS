t = int(input())
for tc in range(t):
    arr = list(map(int, input().split()))
    res = sum(arr)
    for i in arr:
        if i * 2 == res:
            print('YES')
            break
    else:
        print('NO')
