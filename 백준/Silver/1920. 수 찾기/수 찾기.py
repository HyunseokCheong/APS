n = int(input())
arr_n = list(map(int, input().split()))
m = int(input())
arr_m = list(map(int, input().split()))

arr_n.sort()

for i in range(m):
    s = 0
    e = n - 1
    while s <= e:
        mid = (s + e) // 2
        if arr_n[mid] == arr_m[i]:
            print(1)
            break
        elif arr_n[mid] > arr_m[i]:
            e = mid - 1
        else:
            s = mid + 1
    else:
        print(0)
