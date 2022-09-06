A, B, C = map(int, input().split())
i = 0
while True:
    i += 1
    if i % A == 0 and i % B == 0 and i % C == 0:
        print(i)
        break