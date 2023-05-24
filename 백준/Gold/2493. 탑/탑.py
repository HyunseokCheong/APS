n = int(input())
arr = list(map(int, input().split()))
ans = [0] * n
stack = []

for i in range(n):
    while stack:
        if stack[-1][1] > arr[i]:
            ans[i] = stack[-1][0] + 1
            break
        else:
            stack.pop()
    if not stack:
        ans[i] = 0
    stack.append([i, arr[i]])
print(*ans)
