n = int(input())
di = {}
for _ in range(n):
    a, b = input().split()
    if a in di:
        di[a] += int(b)
    else:
        di[a] = int(b)
for k, v in di.items():
    if v == 5:
        print("YES")
        exit()
print("NO")