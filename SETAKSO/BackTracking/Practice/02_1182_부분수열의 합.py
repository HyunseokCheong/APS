N, S = map(int, input().split())
nums = list(map(int, input().split()))

cnt = 0


def subset(idx, res):
    global cnt
    if idx == N:  # idx >= N
        return
    res += nums[idx]
    if res == S:
        cnt += 1
    subset(idx + 1, res)
    subset(idx + 1, res - nums[idx])


subset(0, 0)
print(cnt)