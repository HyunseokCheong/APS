t = int(input())
for tc in range(t):
    s = list(input().split('()'))
    cnt = 0
    ans = 0
    for i in range(len(s)):
        ans += cnt
        for j in range(len(s[i])):
            if s[i][j] == '(':
                cnt += 1
            elif s[i][j] == ')':
                cnt -= 1
                ans += 1
    print(f'#{tc + 1} {ans}')
