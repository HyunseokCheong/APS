n = int(input())
arr = list(map(int, input().split()))
v = int(input())

answer = 0
for a in arr:
    if a == v:
        answer += 1

print(answer)