n = int(input())
tower_list = list(map(int, input().split()))
result = [0] * n
stack = []

for i in range(n):
    while stack:
        if stack[-1][1] > tower_list[i]:
            result[i] = stack[-1][0] + 1
            break
        else:
            stack.pop()
    if not stack:
        result[i] = 0
    stack.append([i, tower_list[i]])
print(*result)