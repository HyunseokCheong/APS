import sys

input = sys.stdin.readline

n = int(input())
for _ in range(n):
    line = input().strip()
    stack = []

    for c in line:
        if c == "(":
            stack.append("(")
        elif c == ")":
            if not stack:
                print("NO")
                break
            stack.pop()
    else:
        if stack:
            print("NO")
        else:
            print("YES")