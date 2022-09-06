import sys

input = sys.stdin.readline

H, M = map(int, input().split())
if M >= 45:
    M -= 45
else:
    M += 15
    H -= 1
    if H < 0:
        H = 23
print(H, M)