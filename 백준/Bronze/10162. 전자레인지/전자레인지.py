n = int(input())

if n % 10 != 0:
    print(-1)
else:
    ans = [0, 0, 0]
    # 300
    while n >= 300:
        n -= 300
        ans[0] += 1
    # 60
    while n >= 60:
        n -= 60
        ans[1] += 1
    # 10
    while n:
        n -= 10
        ans[2] += 1
    print(*ans)