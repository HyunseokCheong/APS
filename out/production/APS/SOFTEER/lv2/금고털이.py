w, n = map(int, input().split())

jewel = []

for i in range(n):
    jewel.append(list(map(int, input().split())))

jewel.sort(key=lambda x: x[1], reverse=True)

p = 0
for j in jewel:
    if w == 0:
        break

    weight = j[0]
    price = j[1]

    min_weight = min(w, weight)

    p += min_weight * price
    w -= min_weight

print(p)
