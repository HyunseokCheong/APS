N = int(input())
arr = []
for i in range(N):
    a, b, c, d = input().split()
    b, c, d = map(int, (b, c, d))
    arr.append((d, c, b, a))
arr.sort()
print(arr[-1][3], arr[0][3], sep='\n')