def eratos(num):
    prime = [True] * (num + 1)
    for i in range(2, int(num ** 0.5) + 1):
        if prime[i]:
            for j in range(i + i, num + 1, i):
                prime[j] = False
    return prime


prime_list = eratos(1000000)

t = int(input())
for tc in range(t):
    n = int(input())

    cnt = 0
    for k in range(2, n // 2 + 1):
        if prime_list[k] and prime_list[n - k]:
            cnt += 1

    print(cnt)
