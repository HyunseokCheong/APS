s = int(input())
a = int(input())
b = int(input())

p = 250
if s <= a:
    pass
else:
    p += ((s - a) // b) * 100
    if (s-a) % b != 0:
        p += 100
print(p)