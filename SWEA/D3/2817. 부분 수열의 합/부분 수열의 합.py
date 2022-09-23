t = int(input())
for tc in range(t):
    n, k = map(int, input().split())
    arr = list(map(int, input().split()))
    cnt = 0
    temp = []

    for i in range(n):
        if arr[i] == k:
            cnt += 1
        else:
            temp.append(arr[i])
            for j in range(len(temp) - 1):
                res = temp[j] + arr[i]
                if res == k:
                    cnt += 1
                elif res < k:
                    temp.append(res)
    print(f'#{tc + 1} {cnt}')