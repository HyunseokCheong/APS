N = int(input())
answer = [0, 1]

if N > 1:
    for i in range(2, N + 1):
        answer.append(answer[-2] + answer[-1])

print(answer[N])
