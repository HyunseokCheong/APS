n = int(input())

count = 0

while True:
    if n == 0:
        break
    if n == 1:
        count += 1
        break

    if n % 2 != 0:
        count += 1
        n = n // 2 + 1
        # n -= 1
    else:
        count += 1
        n //= 2

print(count)
