burger = []
set = []

for i in range(3):
    price = int(input())
    burger.append(price)

for i in range(2):
    price = int(input())
    set.append(price)

answer = min(burger) + min(set) - 50

print(answer)