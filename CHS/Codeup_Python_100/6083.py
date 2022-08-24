R, G, B = map(int, input().split())
cnt = 0
for i in range(R):
    for j in range(G):
        for k in range(B):
            print(i, j, k)
            cnt += 1
print(cnt)