L, P = map(int, input().split())
arr = list(map(int, input().split()))
res = L * P

for i in arr:
    print(i - res, end=' ')