n = input()
n = sorted(n, reverse=True)
val = 0
if '0' not in n:
    print(-1)
else:
    for i in n:
        val += int(i)
    if val % 3 != 0:
        print(-1)
    else:
        print(''.join(n))
