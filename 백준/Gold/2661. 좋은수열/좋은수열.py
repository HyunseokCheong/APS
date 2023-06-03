def check(x):
    length = len(x)
    for i in range(1, length // 2 + 1):
        if x[-i:] == x[-(i * 2):-i]:
            return False
    return True


def recur(x):
    if len(x) == n:
        print(x)
        exit()
    for i in '123':
        if check(x + i):
            recur(x + i)


n = int(input())
recur('1')