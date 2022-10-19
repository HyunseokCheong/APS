t = int(input())
for tc in range(t):
    n, q = map(int, input().split())
    arr = list(map(int, input().split()))

    ans = sum(arr)
    even = 0
    odd = 0
    for i in range(n):
        if arr[i] % 2 == 0:
            even += 1
        else:
            odd += 1

    for i in range(q):
        a, b = map(int, input().split())
        if a == 0:
            ans += b * even
            if b % 2 == 0:
                pass
            elif b % 2 == 1:
                even = 0
                odd = n
        elif a == 1:
            ans += b * odd
            if b % 2 == 0:
                pass
            elif b % 2 == 1:
                even = n
                odd = 0
        print(ans)
