flag = True
while flag:
    a, b = map(int, input().split())
    if a + b == 0:
        break
    print(a + b)