G = int(input())
P = [i for i in range(1, 100001)]
Q = [i for i in range(1, 100001)]
N, M = 100000, 100000
left, right = 0, 0
ans = []

while left < N and right < M:
    temp = (P[left] + Q[right]) * (P[left] - Q[right])
    if temp == G:
        ans.append(P[left])
    if temp < G:
        left += 1
        continue
    right += 1

if len(ans) == 0:
    print(-1)
else:
    for i in ans:
        print(i)
