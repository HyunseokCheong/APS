def solve(depth, res):
    global cnt
    if depth >= n:
        return
    if res + arr[depth] == k:
        cnt += 1

    solve(depth + 1, res)
    solve(depth + 1, res + arr[depth])


for tc in range(int(input())):
    n, k = map(int, input().split())
    arr = list(map(int, input().split()))

    cnt = 0
    solve(0, 0)
    print(f'#{tc + 1} {cnt}')
