t = int(input())
for tc in range(t):
    h, w, n = map(int, input().split())
    if n % h == 0:
        room = h * 100 + n // h
    else:
        room = (n % h) * 100 + n // h + 1
    print(room)
