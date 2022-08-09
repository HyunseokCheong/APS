N, M = map(int, input().split())
colors = []

for i in range(M):
    colors.append(int(input()))

S = 1
E = max(colors)

while S <= E:
    mid = (S + E) // 2
    total = 0
    for i in colors:
        if i % mid == 0:
            total += i // mid
        else:
            total += i // mid + 1
    if total > N:
        S = mid + 1
    else:
        E = mid - 1
print(S)