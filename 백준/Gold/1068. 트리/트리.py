def recur(parent: int):
    global count

    if parent == d:
        return

    if not tree[parent]:
        count += 1
        return

    for child in tree[parent]:
        recur(child)


n = int(input())
arr = list(map(int, input().split()))
d = int(input())

tree = [[] for _ in range(n)]
root = -1
for child in range(n):
    parent = arr[child]
    if parent == -1:
        root = child
        continue
    tree[parent].append(child)

if root == d:
    print(0)
    exit()

for parent in range(n):
    if d in tree[parent]:
        tree[parent].remove(d)

count = 0
recur(root)
print(count)