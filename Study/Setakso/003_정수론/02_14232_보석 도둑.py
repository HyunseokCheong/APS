N = int(input())
arr = []
X = N

for i in range(2, N + 1):
    if i * i > N:
        break
    while X % i == 0:
        arr.append(i)
        X = X // i

if X != 1:
    arr.append(X)

print(len(arr))
print(*arr)
