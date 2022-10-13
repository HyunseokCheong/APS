c = int(input())
for i in range(c):
    arr = list(map(int, input().split()))
    n = arr[0]
    arr = arr[1:]
    avg = sum(arr) / n
    over = 0
    for j in range(n):
        if arr[j] > avg:
            over += 1
    print(f'{(over / n) * 100:.3f}%')
