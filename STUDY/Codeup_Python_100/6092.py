N = int(input())
nums = list(map(int, input().split()))
for i in range(1, 24):
    print(nums.count(i), end=' ')