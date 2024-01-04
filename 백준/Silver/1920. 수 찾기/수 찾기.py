store = {}
n = int(input())
arr1 = list(map(int, input().split()))
for a in arr1:
    store[a] = True

x = int(input())
arr2 = list(map(int, input().split()))
for a in arr2:
    print(1 if a in store else 0)