s = input()

idx = 0
for i in s:
    print(i, end='')
    idx += 1
    if idx > 9:
        idx = 0
        print()
