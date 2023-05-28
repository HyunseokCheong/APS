def print_star(x):
    for i in range(x):
        print("*" * (i + 1))


while True:
    n = int(input())
    if n == 0:
        break
    print_star(n)