N = int(input())
K = int(input())

A = []
for i in range(1, N + 1):
    for j in range(1, N + 1):
        A.append(i * j)
A.sort()
print(A[K])
