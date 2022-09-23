n = int(input())
for i in range(n):
    num = int(input())

    for j in range(2, num + 1):
        cnt = 0
        if num % j == 0:
            while num % j == 0:
                num //= j
                cnt += 1
            print(j, cnt)
        elif num == 1:
            break