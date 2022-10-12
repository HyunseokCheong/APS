def eratostenes(x):
    arr = [1] * x
    arr[0] = arr[1] = 0
    for i in range(2, x):
        if arr[i]:
            for j in range(i * i, x, i):
                arr[j] = 0
    return arr


prime = eratostenes(123456 * 2)
while True:
    n = int(input())
    if n == 0:
        break
    print(sum(prime[n + 1:2 * n + 1]))

