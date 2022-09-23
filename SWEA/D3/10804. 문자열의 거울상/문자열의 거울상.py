t = int(input())
for tc in range(t):
    s = input()[::-1]

    for i in range(len(s)):
        if s[i] == 'b':
            s = s[:i] + 'd' + s[i + 1:]
        elif s[i] == 'd':
            s = s[:i] + 'b' + s[i + 1:]
        elif s[i] == 'p':
            s = s[:i] + 'q' + s[i + 1:]
        elif s[i] == 'q':
            s = s[:i] + 'p' + s[i + 1:]
    print(f'#{tc + 1} {s}')