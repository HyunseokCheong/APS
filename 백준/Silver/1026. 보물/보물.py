n = int(input())
arr_a = list(map(int, input().split()))
arr_b = list(map(int, input().split()))

arr_a.sort()
arr_b.sort(reverse=True)

ans = 0
for i in range(n):
    ans += arr_a[i] * arr_b[i]
print(ans)
