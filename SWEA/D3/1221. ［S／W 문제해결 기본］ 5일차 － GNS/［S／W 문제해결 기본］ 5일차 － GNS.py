arr = ['ZRO', 'ONE', 'TWO', 'THR', 'FOR', 'FIV', 'SIX', 'SVN', 'EGT', 'NIN']

t = int(input())
for _ in range(t):
    tc, n = input().split()
    s = input().split()
    ans = []
    for i in range(10):
        for j in range(int(n)):
            if s[j] == arr[i]:
                ans.append(s[j])
    print(tc)
    print(*ans)