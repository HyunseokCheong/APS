t = int(input())
for tc in range(t):
    n, p = map(int, input().split())
    tree = [n // p] * p
    if n % p != 0:
        for i in range(n % p):
            tree[i] += 1
    ans = 1
    for i in tree:
        ans *= i
    print(f'#{tc + 1} {ans}')