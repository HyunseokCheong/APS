N = int(input())
nums = list(map(int, input().split()))

for i in range(N - 1, 0, -1):
    for j in range(0, i):
        if nums[j] > nums[j + 1]:
            nums[j], nums[j + 1] = nums[j + 1], nums[j]

answer = nums[0] * nums[-1]
print(answer)