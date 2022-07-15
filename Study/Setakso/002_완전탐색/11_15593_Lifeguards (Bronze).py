N = int(input())
LG = []
for i in range(N):
    LG.append(list(map(int, input().split())))

answer = 0

for i in range(N):
    result = 0
    for j in range(1, 1001):
        for k in range(N):
            if k != i:
                if LG[k][0] <= j < LG[k][1]:
                    result += 1
                    break
    answer = max(result, answer)

print(answer)
