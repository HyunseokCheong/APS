n = int(input())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())
arr.sort()
print(*arr, sep='\n')
