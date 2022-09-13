for tc in range(int(input())):
    N, P = map(int, input().split())
    lst = [N // P] * P
    if N % P != 0:
        for i in range(N % P):
            lst[i] += 1
    ans = 1
    for i in lst:
        ans *= i
    print(f'#{tc + 1} {ans}')
