arr = [0] * 5
for i in range(5):
    n = int(input())
    arr[i] = n if n >= 40 else 40
print(sum(arr) // 5)
