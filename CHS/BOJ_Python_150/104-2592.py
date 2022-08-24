arr = []
for i in range(10):
    arr.append(int(input()))

max_count = 0
max_num = 0
for i in arr:
    if arr.count(i) > max_count:
        max_count = arr.count(i)
        max_num = i
N = len(arr)

print(sum(arr) // N)
print(max_num)