def fibo(n):
    if n == 0 or n == 1:
        return n
    else:
        return fibo(n - 2) + fibo(n - 1)

print(fibo(int(input())))