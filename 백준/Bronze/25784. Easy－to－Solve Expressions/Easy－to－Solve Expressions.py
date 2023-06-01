a, b, c = map(int, input().split())

if (a + b + c) / 2 == max(a, b, c):
    print(1)
elif (a * b * c) / max(a, b, c) == max(a, b, c):
    print(2)
else:
    print(3)