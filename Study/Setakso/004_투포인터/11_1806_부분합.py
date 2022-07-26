N, S = map(int, input().split())
seq = list(map(int, input().split()))
left = 0
right = 0
res = seq[0]
ans = 100001

while True:
    if res >= S:
        res -= N[left]
        ans = min(ans, right - left + 1)
        left += 1
    else:
        right += 1
        if right == N:
            break
        res += seq[right]
if ans == 100001:
    print(0)
else:
    print(ans)
