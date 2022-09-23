def facto(num):
    res = 1
    for i in range(num, 0, -1):
        res *= i
    return res


n, k = map(int, input().split())

ans = facto(n) // (facto(n - k) * facto(k))

print(ans)
