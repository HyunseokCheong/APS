N = int(input())
K = int(input())
S = 1
E = K
while S <= E:
    mid = (S + E) // 2
    temp = 0
    for i in range(1, N + 1):
        temp += min(mid // i, N)
    if temp >= K:
        answer = mid
        E = mid - 1
    else:
        S = mid + 1
print(answer)