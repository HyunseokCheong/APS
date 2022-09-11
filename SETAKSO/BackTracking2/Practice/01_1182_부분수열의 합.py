def subset(depth, val):
    global cnt
    if depth == N:
        if val == S:
            cnt += 1
    else:
        subset(depth + 1, val + nums[depth])
        subset(depth + 1, val)


N, S = map(int, input().split())
nums = list(map(int, input().split()))
cnt = 0
subset(0, 0)
if S == 0:
    print(cnt - 1)
else:
    print(cnt)