t = int(input())
for tc in range(t):
    n = int(input())
    print(f'#{tc + 1}', end=' ')
    for i in [2, 3, 5, 7, 11]:
        cnt = 0
        while n % i == 0:
            n //= i
            cnt += 1
        print(cnt, end=' ')
    print()