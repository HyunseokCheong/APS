N, M = map(int, input().split())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
arr = []
for i in A:
    arr.append(i)
for i in B:
    arr.append(i)
arr.sort()
print(*arr)
