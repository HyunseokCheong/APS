N = int(input())
res = 0
for i in range(2, N // 2 + 1):
    A = N // i
    res += A * i - i
print(res % 1000000)
