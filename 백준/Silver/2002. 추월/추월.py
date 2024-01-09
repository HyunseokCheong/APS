import sys

input = sys.stdin.readline

n = int(input())

store = {}  # car : idx
for i in range(n):
    store[input()] = i

passed = [""] * n
for i in range(n):
    passed[i] = input()

result = 0
for i in range(n - 1):
    for j in range(i + 1, n):
        car1 = store[passed[i]]
        car2 = store[passed[j]]
        if car1 > car2:
            result += 1
            break
print(result)