A, B, C, N = map(int, input().split())
cnt = 0

for i in range(N // A + 1):
    for j in range(N // B + 1):
        for k in range(N // C + 1):
            if A * i + B * j + C * k == N:
                cnt = 1
                break

if cnt == 1:
    print(1)
else:
    print(0)
