min_burger = 2000
for i in range(3):
    burger = int(input())
    if burger < min_burger:
        min_burger = burger

min_drink = 2000
for i in range(2):
    drink = int(input())
    if drink < min_drink:
        min_drink = drink

print(min_drink + min_burger - 50)