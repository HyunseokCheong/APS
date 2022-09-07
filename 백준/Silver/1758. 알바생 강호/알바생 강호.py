N = int(input())
tips = []

for i in range(N):
    tip = int(input())
    tips.append(tip)

tips.sort(reverse=True)

result = 0
for i in range(N):
    tip = tips[i] - i
    if tip > 0:
        result += tip
print(result)