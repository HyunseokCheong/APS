N, P = map(int, input().split())
arr = []
res = N

while True:
    res = (res * N) % P
    if res in arr:
        print(len(arr) - arr.index(res))
        break
    arr.append(res)