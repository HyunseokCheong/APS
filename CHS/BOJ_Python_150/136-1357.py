def rev(n):
    return int(str(n)[::-1])

A, B = map(int, input().split())
print(rev(rev(A) + rev(B)))