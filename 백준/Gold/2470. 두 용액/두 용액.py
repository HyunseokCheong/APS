n = int(input())
arr = sorted(list(map(int, input().split())))

s = 0
e = n - 1

mnv = 2e+9 + 1
ans = []

while s < e:
    res = arr[s] + arr[e]
    if res == 0:
        print(arr[s], arr[e])
        exit()
    if abs(res) < mnv:
        mnv = abs(res)
        ans = [arr[s], arr[e]]
    if res < 0:
        s += 1
    else:
        e -= 1
print(*ans)
