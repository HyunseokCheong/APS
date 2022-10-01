n, q = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
for i in range(q):
    a, b = map(int, input().split())
    print(arr[a - 1][b])
