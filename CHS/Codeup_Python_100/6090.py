A, M, D, N = map(int, input().split())
for i in range(N - 1):
    A = A * M + D
print(A)
