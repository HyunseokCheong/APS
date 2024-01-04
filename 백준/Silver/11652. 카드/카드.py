n = int(input())
count = 0
result = 0
store = {}
for i in range(n):
    num = int(input())
    if num in store:
        store[num] = store[num] + 1
    else:
        store[num] = 1
    if store[num] > count:
        count = store[num]
        result = num
    elif store[num] == count and num < result:
        result = num
print(result)