# 중복 케이스 제외
def recur3(cur, start):
    if cur == N:
        print(*arr)
        return
    for i in range(start, M):
        arr[cur] = i + 1
        recur3(cur + 1, i + 1)


M, N = map(int, input().split())
arr = [0 for i in range(N)]

recur3(0, 0)
