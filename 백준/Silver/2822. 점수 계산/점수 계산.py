A = []
B = []
max_score = 0
for i in range(8):
    A.append(int(input()))

for i in range(5):
    B.append(A.index(max(A)) + 1)
    max_score += A[A.index(max(A))]
    A[A.index(max(A))] = 0
B.sort()
print(max_score)

for i in B:
    print(i, end=' ')