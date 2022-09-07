H, M = map(int, input().split())

M -= 45
if M >= 0:
    print(H, M)
else:
    M += 60
    H -= 1
    if H >= 0:
        print(H, M)
    else:
        H += 24
        print(H, M)