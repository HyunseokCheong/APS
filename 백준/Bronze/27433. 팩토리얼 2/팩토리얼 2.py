def facto(x):
    if x <= 1:
        return 1
    else:
        return facto(x - 1) * x


N = int(input())
print(facto(N))