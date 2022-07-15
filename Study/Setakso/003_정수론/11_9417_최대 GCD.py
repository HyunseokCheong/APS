import math

N = int(input())

for i in range(N):
    arr = []
    nums = list(map(int, input().split()))
    for j in range(len(nums)):
        for k in range(len(nums)):
            if j > k and j != k:
                arr.append(math.gcd(nums[j], nums[k]))
            else:
                pass
    print(max(arr))
