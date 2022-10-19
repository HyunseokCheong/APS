'''
1 <= M <= N <= 1000000
'''

m, n = map(int, input().split())
arr = [True] * (n + 1)

for i in range(n + 1):
    if i == 0 or i == 1:
        continue
    elif arr[i]:
        for j in range(2 * i, n + 1, i):
            arr[j] = False
        if i >= m:
            print(i)