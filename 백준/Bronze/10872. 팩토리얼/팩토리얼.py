def facto(x):
    if x == 0:
        return 1
    elif x == 1:
        return 1
    else:
        return facto(x - 1) * x


print(facto(int(input())))
