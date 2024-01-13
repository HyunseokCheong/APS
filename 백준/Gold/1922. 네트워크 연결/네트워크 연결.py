def find(arr, x) -> int:
    if arr[x] != x:
        arr[x] = find(arr, arr[x])
    return arr[x]


def union(arr, x, y):
    parent_x = find(arr, x)
    parent_y = find(arr, y)
    if parent_x == parent_y:
        return
    # 대소 관계를 비교하지 않으면 find 연산이 커질 수 있다.
    if parent_x < parent_y:
        arr[parent_y] = parent_x
    else:
        arr[parent_x] = parent_y


n = int(input())
m = int(input())

edges = []
for _ in range(m):
    a, b, w = map(int, input().split())
    edges.append((w, a, b))
edges.sort()

parent = [i for i in range(n + 1)]
result = 0

for edge in edges:
    w, a, b = edge
    if find(parent, a) != find(parent, b):
        union(parent, a, b)
        result += w

print(result)