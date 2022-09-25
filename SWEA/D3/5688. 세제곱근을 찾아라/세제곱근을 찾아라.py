t = int(input())
for tc in range(t):
    n = int(input())
    ans = -1
    for i in range(1, n + 1):
        if i ** 3 > n:
            break
        if i ** 3 == n:
            ans = i
            break
    print(f'#{tc + 1} {ans}')