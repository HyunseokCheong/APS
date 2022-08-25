# 한 케이스 내에 같은 수가 없는 것들만 출력
def recur2(cur):
    if cur == N:
        print(*arr)
        return
    for i in range(M):
        if visited[i]:
            continue
        arr[cur] = nums[i]
        visited[i] = True
        recur2(cur + 1)
        visited[i] = False


M, N = map(int, input().split())
arr = [0 for i in range(N)]
visited = [False for i in range(M)]

nums = list(map(int, input().split()))
nums.sort()

recur2(0)
