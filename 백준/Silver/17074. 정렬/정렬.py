import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))

result = 0
nums = [- (10 ** 9)] + nums + [10 ** 9]

temp = []
for i in range(1, N + 1):
    if nums[i - 1] > nums[i]:
        result += 1
        temp.append(i - 1)

if result == 0:
    print(N)
elif result >= 2:
    print(0)
else:
    result = 0
    if nums[temp[0]] <= nums[temp[0] + 2]:
        result += 1
    if nums[temp[0] - 1] <= nums[temp[0] + 1]:
        result += 1
    print(result)