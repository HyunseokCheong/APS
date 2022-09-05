L = int(input())  # 1 <= L <= 1000
roll = [0] * (L + 1)

max_expect = 0
max_expect_idx = 0

N = int(input())  # 1 <= N <= 1000
for i in range(1, N + 1):
    S, E = map(int, input().split())
    if E - S + 1 > max_expect:
        max_expect = E - S + 1
        max_expect_idx = i
    for j in range(S, E + 1):
        if roll[j] == 0:
            roll[j] = i

max_value = 0
max_idx = 0
for i in range(1, N + 1):
    val = 0
    for j in range(1, L + 1):
        if roll[j] == i:
            val += 1
    if val > max_value:
        max_value = val
        max_idx = i

print(max_expect_idx, max_idx, sep='\n')