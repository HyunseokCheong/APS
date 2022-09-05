def solve(depth):
    global max_val, answer
    if depth == N:
        temp = 0
        for i in range(0, N - 1):
            temp += abs(temp_list[i] - temp_list[i + 1])
        if temp > max_val:
            answer.append(temp)
            return
    for i in range(N):
        if visited[i]:
            continue
        temp_list[depth] = nums[i]
        visited[i] = True
        solve(depth + 1)
        visited[i] = False


N = int(input())
nums = list(map(int, input().split()))

visited = [False for i in range(N)]
temp_list = [0 for i in range(N)]

max_val = 0
answer = []
solve(0)

print(max(answer))