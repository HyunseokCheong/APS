import sys

input = sys.stdin.readline
n, s = map(int, input().split())
arr = list(map(int, input().split()))

st, en = 0, 1
val = arr[0]
ans = 0

while st < n and en <= n:
    if val < s:
        if en < n:
            val += arr[en]
            en += 1
        else:
            break
    elif val >= s:
        if en - st < ans or ans == 0:
            ans = en - st
        val -= arr[st]
        st += 1
print(ans)
