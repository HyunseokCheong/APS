def binary_search(target, arr, s, e):
    if s > e:
        return 0
    mid = (s + e) // 2
    if arr[mid] == target:
        return 1
    elif arr[mid] > target:
        e = mid - 1
    else:
        s = mid + 1
    return binary_search(target, arr, s, e)


n = int(input())
arr_n = list(map(int, input().split()))
m = int(input())
arr_m = list(map(int, input().split()))
arr_n.sort()
for i in arr_m:
    print(binary_search(i, arr_n, 0, n - 1), end=' ')
