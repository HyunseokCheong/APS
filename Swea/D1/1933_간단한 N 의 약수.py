N = int(input())
arr = []
for i in range(1, int(N ** 0.5) + 1):
    if N % i == 0:
        arr.append(i)
        arr.append(N // i)
arr.sort()
print(*arr)