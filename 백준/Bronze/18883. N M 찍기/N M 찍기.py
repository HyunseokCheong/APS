n, m = map(int, input().split())
idx = 1
for i in range(n):
    for j in range(m):
        if idx % m == 0:
            print(idx, end='')
        else:
            print(idx, end=' ')
        idx += 1
    print()