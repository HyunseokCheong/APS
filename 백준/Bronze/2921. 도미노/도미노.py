N = int(input())
answer = 0
for i in range(0, N + 1):
    for j in range(i, N + 1):
        answer += i + j
print(answer)