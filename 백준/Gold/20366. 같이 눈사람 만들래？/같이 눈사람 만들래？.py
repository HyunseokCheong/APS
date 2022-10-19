import sys

input = sys.stdin.readline
n = int(input())
arr = sorted(list(map(int, input().split())))

mnv = sys.maxsize

for i in range(n - 3):
    for j in range(i + 3, n):
        fix = arr[i] + arr[j]
        s, e = i + 1, j - 1

        while s < e:
            res = arr[s] + arr[e]
            mnv = min(abs(res - fix), mnv)

            if res == fix:
                print(0)
                exit()
            elif res < fix:
                s += 1
            elif res > fix:
                e -= 1
print(mnv)
