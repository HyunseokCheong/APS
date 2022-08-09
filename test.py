'''
2 3
702
429
'''

N, K = map(int, input().split())
arr = [int(input()) for _ in range(N)]

S = 1
E = max(arr)
ans = 0

while S <= E:
    mid = (S + E) // 2
    cnt = 0
    for i in arr:
        temp = i // mid
        cnt += temp
    if cnt >= K:
        S = mid + 1
        ans = mid
    else:
        E = mid - 1
print(ans)