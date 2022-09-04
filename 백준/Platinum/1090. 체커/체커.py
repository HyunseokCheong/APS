N = int(input())
arr = []

for i in range(N):
    arr.append(list(map(int, input().split())))

ans = [1 << 30] * (N + 1)

for i in range(N):
    for j in range(N):
        X, Y = arr[i][0], arr[j][1]
        dist_arr = []
        for k in range(N):
            dist_arr.append(abs(X - arr[k][0]) + abs(Y - arr[k][1]))
        dist_arr.sort()
        res = 0
        for l in range(N):
            res += dist_arr[l]
            if ans[l+1] > res:
                ans[l+1] = res
print(*ans[1:])