t = 0
for _ in range(5):
    s, e = input().split()
    h, m = map(int, e.split(':'))
    t += h * 60 + m
    h, m = map(int, s.split(':'))
    t -= h * 60 + m
print(t)
