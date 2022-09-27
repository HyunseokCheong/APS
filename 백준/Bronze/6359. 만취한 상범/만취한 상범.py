t = int(input())
for tc in range(t):
    n = int(input())

    cnt = 0
    i = 1
    while True:
        if i * i > n:
            break
        cnt += 1
        i += 1

    print(cnt)
