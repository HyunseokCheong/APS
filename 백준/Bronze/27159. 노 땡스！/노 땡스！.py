n = int(input())
li = list(map(int, input().split()))
li.sort()
score = 0
for i in range(n):
    if i == 0:
        score += li[i]
    else:
        if li[i - 1] + 1 == li[i]:
            continue
        else:
            score += li[i]
print(score)