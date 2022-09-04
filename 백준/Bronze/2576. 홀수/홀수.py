odd = []
for i in range(7):
    N = int(input())
    if N % 2 == 1:
        odd.append(N)
if len(odd) == 0:
    print(-1)
else:
    print(sum(odd))
    print(min(odd))