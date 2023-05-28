a, b, c = map(int, input().split(" : "))
d, e, f = map(int, input().split(" : "))
if (d * 3600 + e * 60 + f) < (a * 3600 + b * 60 + c):
    print(86400 - (a * 3600 + b * 60 + c) + (d * 3600 + e * 60 + f))
else:
    print(d * 3600 + e * 60 + f - (a * 3600 + b * 60 + c))