N = int(input())
cnt = 0
for i in range(1, 501):
    for j in range(1, 501):
        if j ** 2 + N == i ** 2:
            cnt += 1
print(cnt)