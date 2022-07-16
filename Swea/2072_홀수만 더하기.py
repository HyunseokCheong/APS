T = int(input())
for i in range(T):
    nums = list(map(int, input().split()))
    res = 0
    for j in nums:
        if j % 2 != 0:
            res += j
    print(f'#{i + 1} {res}')
