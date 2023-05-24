l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())
if a % c == 0:
    x = a // c
else:
    x = a // c + 1
if b % d == 0:
    y = b // d
else:
    y = b // d + 1
print(l - max(x, y))
