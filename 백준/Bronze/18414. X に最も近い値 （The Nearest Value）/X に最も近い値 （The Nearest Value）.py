X, L, R = map(int, input().split())
print(min(range(L, R + 1), key=lambda i: abs(X - i)))