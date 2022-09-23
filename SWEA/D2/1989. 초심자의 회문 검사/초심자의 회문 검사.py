t = int(input())
for tc in range(t):
    s = input()
    ans = 0
    if s == s[::-1]:
        ans = 1
    print(f'#{tc + 1} {ans}')
