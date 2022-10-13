arr = list(map(int, input().split()))

ans = 0
for i in range(5):
    ans += arr[i] ** 2

print(ans % 10)