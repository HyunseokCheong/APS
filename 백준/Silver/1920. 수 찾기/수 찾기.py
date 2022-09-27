def binary_search(arr, x):
    s, e = 0, len(arr) - 1
    while s <= e:
        mid = (s + e) // 2
        if arr[mid] == x:
            return 1
        elif arr[mid] < x:
            s = mid + 1
        else:
            e = mid - 1
    return 0


n = int(input())
arr_n = sorted(list(map(int, input().split())))
m = int(input())
arr_m = list(map(int, input().split()))

for i in arr_m:
    print(binary_search(arr_n, i))
