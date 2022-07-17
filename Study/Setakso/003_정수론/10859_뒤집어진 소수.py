def prime(n):
    if n == 1:
        return False
    for i in range(2, n + 1):
        if i * i > n:
            break
        if n % i == 0:
            return False
    return True

N = int(input())
r = 0
temp = N
bNum = True
while temp > 0:
    now = temp % 10
    temp //= 10
    if now == 3 or now == 4 or now == 7:
        bNum = False
        break
    if now == 6:
        now = 9
    elif now == 9:
        now = 6
    if r <= 0:
        r += now
    else:
        r *= 10
        r += now

if not bNum or not prime(N) or not prime(r):
    print('no')
else:
    print('yes')
