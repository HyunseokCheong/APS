import bisect

T = int(input())
A = int(input())
Arr = list(map(int, input().split()))
B = int(input())
Brr = list(map(int, input().split()))

temp_A = []
for i in range(A):
    temp = 0
    for j in range(i, A):
        temp += Arr[j]
        temp_A.append(temp)

temp_B = []
for i in range(B):
    temp = 0
    for j in range(i, B):
        temp += Brr[j]
        temp_B.append(temp)
temp_B.sort()

cnt = 0
for i in temp_A:
    diff = T - i
    idx = bisect.bisect_left(temp_B, diff)
    if idx >= len(temp_B):
        continue
    idx_right = bisect.bisect_right(temp_B, diff)
    if temp_B[idx] == diff:
        cnt += idx_right - idx
print(cnt)