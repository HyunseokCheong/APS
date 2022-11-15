import sys

input = sys.stdin.readline
n = int(input())
arr = [0] * n
for i in range(n):
    arr[i] = int(input())

stack = []
ans = 0

for i in range(n):
    while stack and stack[-1][0] < arr[i]:
        ans += stack.pop()[1]

    if not stack:
        stack.append((arr[i], 1))
        continue

    if stack[-1][0] == arr[i]:
        cnt = stack.pop()[1]
        ans += cnt

        if stack:
            ans += 1
        
        stack.append((arr[i], cnt + 1))
    else:
        stack.append((arr[i], 1))
        ans += 1
print(ans)
