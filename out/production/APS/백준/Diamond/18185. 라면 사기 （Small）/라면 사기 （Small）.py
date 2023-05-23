def buy_three(index):
    global money
    temp = min(ramens[index:index + 3])
    for i in range(index, index + 3):
        ramens[i] -= temp
    money += temp * 7


def buy_two(index):
    global money
    temp = min(ramens[index:index + 2])
    for i in range(index, index + 2):
        ramens[i] -= temp
    money += temp * 5


def buy_two_2(index):
    global money
    temp = min(ramens[index], ramens[index + 1] - ramens[index + 2])
    ramens[index] -= temp
    ramens[index + 1] -= temp
    money += temp * 5


def buy_one(index):
    global money
    temp = ramens[index]
    ramens[index] -= temp
    money += temp * 3


N = int(input())
ramens = list(map(int, input().split())) + [0, 0]
money = 0

for i in range(N):
    if ramens[i + 1] > ramens[i + 2]:
        buy_two_2(i)
        buy_three(i)
    else:
        buy_three(i)
        buy_two(i)
    buy_one(i)
print(money)
