import sys

input = sys.stdin.readline

if __name__ == "__main__":
    stack = []
    n = int(input())
    for _ in range(n):
        op = input().split()

        if op[0] == "push":
            stack.append(op[1])
        elif op[0] == "pop":
            print(-1 if not stack else stack.pop())
        elif op[0] == "size":
            print(len(stack))
        elif op[0] == "empty":
            print(1 if not stack else 0)
        elif op[0] == "top":
            print(-1 if not stack else stack[-1])