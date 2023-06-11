n = int(input())
arr = list(map(int, input().split()))
answer = (n - 1) * 8 + sum(arr)
print(answer // 24, answer % 24)