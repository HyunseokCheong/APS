import sys

input = sys.stdin.readline

n = int(input())
sq = list(map(int, input().split()))
li = [0]

for i in sq:
    if li[-1] < i:
        li.append(i)
    else:
        l = 0
        r = len(li)

        while l < r:
            m = (l + r) // 2

            if li[m] < i:
                l = m + 1
            else:
                r = m

        li[r] = i

print(len(li) - 1)