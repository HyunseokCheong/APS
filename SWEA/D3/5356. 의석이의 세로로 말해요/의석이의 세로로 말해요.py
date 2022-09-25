t = int(input())
for tc in range(t):
    s = [list(input()) for _ in range(5)]
    ans = ''
    for i in range(15):
        for j in range(5):
            if len(s[j]) > i:
                ans += s[j][i]
    print(f'#{tc + 1} {ans}')