k, n = map(int, input().split())
di = {}
for i in range(n):
    di[input()] = i

sd = sorted(di.items(), key=lambda x: x[1])
k = len(sd) if k > len(sd) else k

for i in range(k):
    print(sd[i][0])