import sys

input = sys.stdin.readline

N = int(input())
answer = 0
for i in range(N):
    A, B, C = map(int, input().split())
    temp = 0
    if A == B == C:
        temp = 10000 + A * 1000
    elif A == B or A == C:
        temp = 1000 + A * 100
    elif B == C:
        temp = 1000 + B * 100
    else:
        temp = max(A, B, C) * 100
    if temp > answer:
        answer = temp
print(answer)
