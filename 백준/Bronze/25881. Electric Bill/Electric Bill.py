a, b = map(int, input().split())
for i in range(int(input())):
    c = int(input())
    print(f'{c} {a * c if c <= 1000 else a * 1000 + (c - 1000) * b}')