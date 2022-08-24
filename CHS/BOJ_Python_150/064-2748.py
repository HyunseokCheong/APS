def fibo(n):
    arr = []
    for i in range(0, n + 1):
        if i == 0 or i == 1:
            arr.append(i)
        else:
            arr.append(arr[i - 2] + arr[i - 1])
    return arr[-1]


N = int(input())
print(fibo(N))
