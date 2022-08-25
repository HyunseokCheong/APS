def recur(cur):
    if cur == N:
        print(*arr)
        return
    for i in range(M):
        arr[cur] = nums[i]
        recur(cur + 1)


M, N = map(int, input().split())
arr = [0 for i in range(N)]

nums = list(map(int, input().split()))
nums.sort()
recur(0)
