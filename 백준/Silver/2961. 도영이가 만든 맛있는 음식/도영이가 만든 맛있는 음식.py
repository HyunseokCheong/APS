def recur(depth, sour_value, bitter_value, count):
    global min_value
    if depth == N:
        if count != 0:
            min_value = min(min_value, abs(sour_value - bitter_value))
        return

    recur(depth + 1, sour_value * sour[depth], bitter_value + bitter[depth], count + 1)
    recur(depth + 1, sour_value, bitter_value, count)


sour = []
bitter = []

N = int(input())
for _ in range(N):
    s, b = map(int, input().split())
    sour.append(s)
    bitter.append(b)

min_value = 10 ** 10
if N == 1:
    min_value = abs(sour[0] - bitter[0])
else:
    recur(0, 1, 0, 0)
print(min_value)
