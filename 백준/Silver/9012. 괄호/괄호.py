T = int(input())
for i in range(T):
    bracket = list(input())
    cnt = 0
    for j in bracket:
        if j == '(':
            cnt += 1
        elif j == ')':
            cnt -= 1
        if cnt < 0:
            print('NO')
            break
    if cnt > 0:
        print('NO')
    elif cnt == 0:
        print('YES')