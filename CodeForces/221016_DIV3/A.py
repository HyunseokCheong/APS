t = int(input())
for tc in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    s = input()
    dic = {}
    for i in range(n):
        dic[arr[i]] = s[i]

    for i in range(n):
        if dic[arr[i]] == 0:
            dic[arr[i]] = s[i]
        else:
            if dic[arr[i]] != s[i]:
                print('NO')
                break
    else:
        print('YES')
