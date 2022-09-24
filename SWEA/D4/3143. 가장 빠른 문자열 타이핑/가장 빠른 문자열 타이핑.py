t = int(input())
for tc in range(t):
    s1, s2 = input().split()

    idx = 0
    cnt = 0

    while idx != len(s1):
        if s1[idx:idx + len(s2)] == s2:
            cnt += 1
            idx += len(s2)
        else:
            cnt += 1
            idx += 1

    print(f'#{tc + 1} {cnt}')