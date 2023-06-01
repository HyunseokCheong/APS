t = int(input())
for tc in range(t):
    s = list(input())
    ans = 0
    for i in s:
        if i == '(':
            ans += 1
        else:
            ans -= 1
        if ans < 0:
            print('NO')
            break
    if ans > 0:
        print('NO')
    elif ans == 0:
        print('YES')