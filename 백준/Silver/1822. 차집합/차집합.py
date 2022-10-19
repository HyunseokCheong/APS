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


a, b = map(int, input().split())
arr_a = list(map(int, input().split()))
arr_b = sorted(list(map(int, input().split())))

ans = 0
arr_ans = []

for i in arr_a:
    if binary_search(i, arr_b, 0, b - 1):
        continue
    else:
        ans += 1
        arr_ans.append(i)

arr_ans.sort()

if ans != 0:
    print(ans)
    print(*arr_ans)
else:
    print(ans)
