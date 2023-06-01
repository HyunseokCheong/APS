n = int(input())
arr = [int(input()) for _ in range(n)]

stack = []
ans = 0

for i in range(n - 1, -1, -1):
    cnt = 0
    while stack:
        if stack[-1][0] < arr[i]:
            cnt += stack[-1][1] + 1
            del stack[-1]
        else:
            stack.append([arr[i], cnt])
            break

    if not stack: stack.append([arr[i], cnt])
    ans += cnt
print(ans)
