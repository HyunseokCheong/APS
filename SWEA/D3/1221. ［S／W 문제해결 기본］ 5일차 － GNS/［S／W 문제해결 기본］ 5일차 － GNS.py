arr = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
for i in range(int(input())):
    tc, N = input().split()
    nums = list(input().split())
    temp = []
    for j in arr:
        for k in range(0, int(N)):
            if j == nums[k]:
                temp.append(nums[k])
    print(tc)
    print(*temp)