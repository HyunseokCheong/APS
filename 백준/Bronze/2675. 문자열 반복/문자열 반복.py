t = int(input())

for _ in range(t):
    n, data = input().split()
    n = int(n)
    for d in data:
        print(d * n, end="")
    print()