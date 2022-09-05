D = int(input())
nums = list(map(int, input().split()))
cnt = 0

for i in nums:
    if i == D:
        cnt += 1

print(cnt)