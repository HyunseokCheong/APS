while True:
    N = int(input())
    if N == -1:
        break

    divisor = []
    for i in range(1, N):
        if N % i == 0:
            divisor.append(i)

    if sum(divisor) == N:
        print(N, "=", end=" ")
        print(*divisor, sep=" + ")
    else:
        print("%d is NOT perfect." % N)
