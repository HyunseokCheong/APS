import math

N = int(input())

cnt = 0
for i in range(1, int(math.sqrt(N)) + 1):
    if i ** 2 <= N:
        cnt += 1
print(cnt)
