m = int(input())
n = int(input())
ans = []

for i in range(m, n + 1):
    if i == 1:
        continue
    elif i == 2:
        ans.append(i)
    else:
        for j in range(2, i):
            if i % j == 0:
                break
            elif j == i - 1:
                ans.append(i)
if len(ans) == 0:
    print(-1)
else:
    print(sum(ans))
    print(min(ans))
