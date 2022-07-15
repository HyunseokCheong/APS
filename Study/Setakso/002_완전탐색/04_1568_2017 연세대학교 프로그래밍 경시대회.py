N = int(input())
cnt = 0
for i in range(1, N):
    for j in range(1, N):
        if i * 2 + j * 2 + 2 <= N:
            cnt += 1
print(cnt)
