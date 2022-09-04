T = int(input())
for i in range(T):
    H, W, N = map(int, input().split())
    X = N // H + 1
    Y = N % H
    if Y == 0:
        X = N // H
        Y = H
    print(Y * 100 + X)