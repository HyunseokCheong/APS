n = int(input())
a = list(map(int, input().split()))
b, c = map(int, input().split())

cnt = 0
for i in range(n):
    if a[i] <= b:
        cnt += 1
    else:
        if (a[i] - b) % c == 0:
            cnt += (a[i] - b) // c + 1
        else:
            cnt += (a[i] - b) // c + 2
print(cnt)
