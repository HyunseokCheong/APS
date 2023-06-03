def calc(ls):
    x = 0
    for i in range(n - 1):
        x += abs(ls[i] - ls[i + 1])
    return x


def recur(depth):
    global max_val

    if depth == n:
        max_val = max(max_val, calc(ls))
        return

    for i in range(n):
        if vs[i]:
            continue

        ls[depth] = arr[i]

        vs[i] = True
        recur(depth + 1)
        vs[i] = False


n = int(input())
arr = sorted(list(map(int, input().split())))
ls = [0] * n
vs = [False] * n
max_val = -10 ** 10

recur(0)
print(max_val)
