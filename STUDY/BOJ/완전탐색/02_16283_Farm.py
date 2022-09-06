A, B, N, W = map(int, input().split())
Farm = []

for i in range(1, N):
    if A * i + B * (N - i) == W:
        Farm.append(i)
        Farm.append(N - i)

if len(Farm) != 2:
    print(-1)
else:
    print(*Farm)