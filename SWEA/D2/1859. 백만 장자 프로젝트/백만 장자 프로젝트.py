t = int(input())
for tc in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    mxv = arr[-1]
    ans = 0
    for i in range(n - 2, -1, -1):
        if arr[i] > mxv:
            mxv = arr[i]
        elif arr[i] < mxv:
            ans += mxv - arr[i]
    print(f'#{tc + 1} {ans}')
