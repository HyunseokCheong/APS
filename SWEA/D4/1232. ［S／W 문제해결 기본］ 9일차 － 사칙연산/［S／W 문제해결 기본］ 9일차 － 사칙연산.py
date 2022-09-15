def calc(node):
    if len(tree[node]) == 2:
        return int(tree[node][1])
    else:
        left = calc(int(tree[node][2]))
        right = calc(int(tree[node][3]))
        operator = tree[node][1]
        if operator == '+':
            return left + right
        elif operator == '-':
            return left - right
        elif operator == '*':
            return left * right
        elif operator == '/':
            return left / right


for tc in range(10):
    N = int(input())
    tree = [0] * (N + 1)
    for i in range(N):
        temp = input().split()
        tree[int(temp[0])] = temp
    ans = int(calc(1))
    print(f'#{tc + 1} {ans}')