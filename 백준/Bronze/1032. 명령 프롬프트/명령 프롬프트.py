n = int(input())
for i in range(n):
    s = list(input())
    if i == 0:
        ans = s
    else:
        for j in range(len(s)):
            if ans[j] != s[j]:
                ans[j] = '?'
print(*ans, sep="")
