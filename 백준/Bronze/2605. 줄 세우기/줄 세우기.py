N = int(input())
nums = list(map(int, input().split()))
line = list(i for i in range(1, N + 1))

for i in range(N):
    for j in range(i, i - nums[i], -1):
        line[j], line[j - 1] = line[j - 1], line[j]

print(*line)