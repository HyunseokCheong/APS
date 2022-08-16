nums = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]

for _ in range(int(input())):
    tc, N = input().split()
    N = int(N)
    arr = list(input().split())
    temp = []
    for i in nums:
        for j in range(0, N):
            if i == arr[j]:
                temp.append(i)
    print(tc)
    print(*temp)