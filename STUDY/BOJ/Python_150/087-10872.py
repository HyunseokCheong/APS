N = int(input())
answer = 1
if N == 0 or N == 1:
    print(1)
else:
    for i in range(2, N + 1):
        answer *= i
    print(answer)