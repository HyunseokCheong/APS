t = int(input())
for tc in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    for i in arr:
        if arr.count(i) > 1:
            print('NO')
            break
    else:
        print('YES')
