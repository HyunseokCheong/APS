A, B = map(int, input().split())

for X in range(int(-1000 ** 0.5), int(1000 ** 0.5)):
    if X ** 2 + (2 * A * X) + B == 0:
        print(X, end=' ')