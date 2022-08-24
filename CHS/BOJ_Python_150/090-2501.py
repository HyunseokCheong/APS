N, K = map(int, input().split())
yaksu = []
for i in range(1, N + 1):
    if N % i == 0:
        yaksu.append(i)
yaksu.sort()
if len(yaksu) < K:
    print(0)
else:
    print(yaksu[K - 1])