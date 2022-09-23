t = int(input())
for tc in range(t):
    n, b = map(int, input().split())
    h = list(map(int, input().split()))

    mnv = 1e9
    temp = []

    for i in range(n):
        temp.append(h[i])
        if h[i] == b:
            mnv = h[i]
            break
        for j in range(len(temp) - 1):
            res = h[i] + temp[j]
            if res == b:
                mnv = res
                break
            elif res < b:
                temp.append(res)
            elif b <= res < mnv:
                mnv = res
        if mnv == b:
            break
    print(f'#{tc + 1} {mnv - b}')