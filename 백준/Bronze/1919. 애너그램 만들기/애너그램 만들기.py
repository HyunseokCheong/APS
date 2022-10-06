import sys

input = sys.stdin.readline
arr = [0] * (122 - 97 + 1)

for i in list(input().rstrip()):
    arr[ord(i) - 97] += 1

for i in list(input().rstrip()):
    arr[ord(i) - 97] -= 1

print(sum(map(abs, arr)))
