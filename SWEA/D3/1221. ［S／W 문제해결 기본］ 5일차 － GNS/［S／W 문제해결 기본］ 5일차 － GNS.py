arr = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]

for _ in range(int(input())):
    tc, N = input().split()
    nums = list(input().split())
    result = []
    for i in range(10):
        for j in nums:
            if arr[i] == j:
                result.append(j)
    print(tc)
    print(*result)