t = int(input())
for tc in range(t):
    n, k = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(n)]
    cnt = 0
    for i in range(n):
        row = 0
        col = 0
        for j in range(n):
            if arr[i][j] == 1:
                row += 1
            elif arr[i][j] == 0 and row == k:
                cnt += 1
                row = 0
            elif arr[i][j] == 0:
                row = 0
            if arr[j][i] == 1:
                col += 1
            elif arr[j][i] == 0 and col == k:
                cnt += 1
                col = 0
            elif arr[j][i] == 0:
                col = 0
        if row == k:
            cnt += 1
        if col == k:
            cnt += 1
    
    print(f'#{tc + 1} {cnt}')