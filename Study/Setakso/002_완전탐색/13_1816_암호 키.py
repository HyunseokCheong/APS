N = int(input())
for i in range(N):
    cnt = 0
    S = int(input())
    for j in range(2, 1000001):
        if S % j == 0:
            cnt += 1
            print('NO')
            break
    if cnt == 0:
        print('YES')
