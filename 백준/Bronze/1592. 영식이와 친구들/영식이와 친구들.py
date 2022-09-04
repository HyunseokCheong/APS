N, M, L = map(int, input().split())

friends = [1] + [0] * (N - 1)  # [1, 0, 0, 0, 0]

cnt = i = 0
while True:
    if friends[i] == M:
        break
    elif friends[i] % 2 != 0:
        i = (i + L) % N
        friends[i] += 1
    else:
        i = (i - L) % N
        friends[i] += 1
    cnt += 1

print(cnt)