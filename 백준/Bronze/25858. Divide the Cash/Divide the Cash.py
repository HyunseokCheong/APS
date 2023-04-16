n, p = map(int, input().split())
arr = [int(input()) for _ in range(n)]

su = sum(arr)
tp = p // su

for i in range(n):
    print(arr[i] * tp)