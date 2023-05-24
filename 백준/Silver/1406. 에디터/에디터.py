import sys
input = sys.stdin.readline

lstack = list(input().rstrip())
rstack = []

n = int(input())
for i in range(n):
    tmp = list(input().split())
    command = tmp[0]
    if command == 'L':
        if lstack: rstack.append(lstack.pop())
    elif command == 'D':
        if rstack: lstack.append(rstack.pop())
    elif command == 'B':
        if lstack: lstack.pop()
    elif command == 'P': lstack.append(tmp[1])

ans = []
while lstack: rstack.append(lstack.pop())
while rstack: ans.append(rstack.pop())
print(*ans, sep="")