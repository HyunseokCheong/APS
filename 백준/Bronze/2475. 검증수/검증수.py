nums = list(map(int, input().split()))
arr = []

for i in nums:
    arr.append(i ** 2)

answer = sum(arr) % 10

print(answer)