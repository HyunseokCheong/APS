n = int(input())
arr = [False, False] + [True] * (n - 1)
primes = []
for i in range(2, n + 1):
    if arr[i]:
        primes.append(i)
        for j in range(2 * i, n + 1, i):
            arr[j] = False

cnt = 0
s, e = 0, 0
while e <= len(primes):
    res = sum(primes[s:e])
    if res == n:
        cnt += 1
        e += 1
    elif res < n:
        e += 1
    elif res > n:
        s += 1
print(cnt)
