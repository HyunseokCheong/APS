T = int(input())
for i in range(T):
    nums = list(map(int, input().split()))
    even = []
    for j in nums:
        if j % 2 == 0:
            even.append(j)
    print(sum(even), min(even))