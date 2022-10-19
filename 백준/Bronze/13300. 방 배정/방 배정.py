import sys

input = sys.stdin.readline
'''
0 여 
1 남
'''
n, k = map(int, input().split())
arr = [[0] * 6 for _ in range(2)]
for i in range(n):
    sex, grade = map(int, input().split())
    arr[sex][grade - 1] += 1

cnt = 0

for i in range(2):
    for j in range(6):
        res = arr[i][j]
        if res == 0:
            continue
        elif res <= k:
            cnt += 1
        elif res > k:
            cnt += res // k
            if res % k != 0:
                cnt += 1

print(cnt)
