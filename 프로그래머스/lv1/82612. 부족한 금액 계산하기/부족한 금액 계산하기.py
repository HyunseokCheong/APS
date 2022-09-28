def solution(price, money, count):
    pay = 0
    for i in range(count):
        pay += price * (i + 1)
    if pay > money:
        return pay - money
    else:
        return 0
