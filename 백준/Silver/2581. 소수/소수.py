M = int(input())
N = int(input())
min_value = 0
result = 0
for i in range(M, N + 1):
    cnt = 0
    if i > 1:
        for j in range(2, int(i ** 0.5) + 1):
            if i % j == 0:
                cnt += 1
        if cnt == 0:
            result += i
            if min_value == 0:
                min_value = i
if min_value == 0:
    print(-1)
else:
    print(result)
    print(min_value)