a, b, c = map(int, input().split())
d, e, f = map(int, input().split())
print(sum([max(d - a, 0), max(e - b, 0), max(f - c, 0)]))
