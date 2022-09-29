def find_set(x):
    if x == p[x]:
        return x
    else:
        return find_set(p[x])


def union(x, y):
    p[find_set(y)] = find_set(x)


t = int(input())
for tc in range(t):
    n, m = map(int, input().split())
    arr = list(map(int, input().split()))

    p = [i for i in range(n + 1)]

    for i in range(0, m * 2, 2):
        union(arr[i], arr[i + 1])

    res = set()

    for i in range(1, n + 1):
        res.add(find_set(i))

    print(f'#{tc + 1} {len(res)}')