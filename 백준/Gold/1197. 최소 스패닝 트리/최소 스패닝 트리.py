import sys

input = sys.stdin.readline
V, E = map(int, input().split())

edges = []
for _ in range(E):
    edges.append(list(map(int, input().split())))
edges.sort(key=lambda x: x[2])

parent = [i for i in range(V + 1)]


def get_parent(a):
    if parent[a] == a:
        return a
    parent[a] = get_parent(parent[a])
    return parent[a]


def union_parent(a, b):
    a = get_parent(a)
    b = get_parent(b)

    # 작으면 부모
    if a < b:
        parent[b] = a
    else:
        parent[a] = b


def same_parent(a, b):
    return get_parent(a) == get_parent(b)


ans = 0
for a, b, c in edges:
    if not same_parent(a, b):
        union_parent(a, b)
        ans += c
print(ans)