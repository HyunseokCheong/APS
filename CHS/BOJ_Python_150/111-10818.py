N = int(input())
nums = list(map(int, input().split()))
max_value = -1000000
min_value = 1000000

for _ in range(0, N):
    if nums[_] > max_value:
        max_value = nums[_]
    if nums[_] < min_value:
        min_value = nums[_]

print(min_value, max_value)