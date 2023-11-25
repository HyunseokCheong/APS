for i in range(3):
    n = int(input())
    r = 0
    for j in range(n):
        r += int(input())
    if r > 0:
        print("+")
    if r == 0:
        print(0)
    if r < 0:
        print("-")