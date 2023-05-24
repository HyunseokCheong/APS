test_case = int(input())
for i in range(test_case):
    answer = 0
    n = int(input())
    for j in range(n):
        name, quantity, price = input().split()
        quantity = int(quantity)
        price = float(price)
        answer += quantity * price
    print(f'${answer:.2f}')