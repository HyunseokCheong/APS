t = int(input())
for tc in range(t):
    arr = [list(map(int, input().split())) for _ in range(9)]
    ans = 1
    for i in range(9):
        if len(set(arr[i])) != 9:
            ans = 0
            break
    for i in range(9):
        tmp = []
        for j in range(9):
            tmp.append(arr[j][i])
        if len(set(tmp)) != 9:
            ans = 0
            break
    for i in range(0, 9, 3):
        for j in range(0, 9, 3):
            tmp = []
            for k in range(3):
                for l in range(3):
                    tmp.append(arr[i + k][j + l])
            if len(set(tmp)) != 9:
                ans = 0
                break
    print(f'#{tc + 1} {ans}')