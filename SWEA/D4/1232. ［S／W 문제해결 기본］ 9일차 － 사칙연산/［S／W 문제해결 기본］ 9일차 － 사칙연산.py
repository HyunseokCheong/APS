def solve(x):
    if len(tree[x]) == 2:
        return int(tree[x][1])
    left = solve(int(tree[x][2]))
    right = solve(int(tree[x][3]))
    op = tree[x][1]
    if op == '+':
        return left + right
    elif op == '-':
        return left - right
    elif op == '*':
        return left * right
    elif op == '/':
        return left / right


for tc in range(10):
    n = int(input())
    tree = [0] * (n + 1)
    for i in range(n):
        arr = input().split()
        tree[int(arr[0])] = arr
    print(f'#{tc + 1} {int(solve(1))}')