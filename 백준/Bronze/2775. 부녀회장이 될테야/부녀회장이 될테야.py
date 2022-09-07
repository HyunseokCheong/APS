T = int(input())
for i in range(T):
    K = int(input())
    N = int(input())
    floor = []
    for j in range(1, N + 1):
        floor.append(j)

    for j in range(K):
        for k in range(1, N):
            floor[k] += floor[k-1]
    print(floor[-1])