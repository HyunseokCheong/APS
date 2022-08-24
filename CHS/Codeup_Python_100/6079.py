N = int(input())
i = 0
res = 0
while True:
    res += i
    if res >= N:
        print(i)
        break
    i += 1
