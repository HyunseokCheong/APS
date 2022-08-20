num_list = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]

for _ in range(int(input())):
    tc, N = input().split()
    nums = list(input().split())

    answer = []
    for i in num_list:
        for j in nums:
            if i == j:
                answer.append(j)

    print(tc)
    print(*answer)