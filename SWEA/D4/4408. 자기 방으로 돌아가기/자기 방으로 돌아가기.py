t = int(input())
for tc in range(t):
    rooms = [0] * 201
    n = int(input())
    for i in range(n):
        a, b = map(int, input().split())
        if a > b:
            a, b = b, a
        if a % 2 == 0:
            a = a // 2
        else:
            a = a // 2 + 1
        if b % 2 == 0:
            b = b // 2
        else:
            b = b // 2 + 1
        for j in range(a, b + 1):
            rooms[j] += 1
    print(f'#{tc + 1} {max(rooms)}')
