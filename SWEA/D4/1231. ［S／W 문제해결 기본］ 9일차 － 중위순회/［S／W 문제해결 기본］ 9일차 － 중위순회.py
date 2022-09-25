def solve(x):
    if x <= n:
        solve(2 * x)
        print(tree[x], end='')
        solve(2 * x + 1)


for tc in range(10):
    n = int(input())
    tree = [0] * (n + 1)
    for i in range(n):
        arr = list(input().split())
        tree[i + 1] = arr[1]
    print(f'#{tc + 1}', end=' ')
    solve(1)
    print()
