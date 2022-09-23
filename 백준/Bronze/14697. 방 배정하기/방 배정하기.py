A, B, C, N = map(int, input().split())
answer = 0
for i in range(0, N // C + 1):
    for j in range(0, N // B + 1):
        for k in range(0, N // A + 1):
            if i * C + j * B + k * A == N:
                answer = 1
                break
print(answer)