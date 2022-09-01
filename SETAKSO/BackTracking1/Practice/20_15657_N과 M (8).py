# 중복 케이스 제외
def recur3(cur, start):
    if cur == N:
        print(*arr)
        return
    for i in range(start, M):
        arr[cur] = nums[i]
        recur3(cur + 1, i)


M, N = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
arr = [0 for i in range(N)]

recur3(0, 0)
