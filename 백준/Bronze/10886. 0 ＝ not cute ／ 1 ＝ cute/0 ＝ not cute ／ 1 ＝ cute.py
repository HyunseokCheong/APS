n = int(input())
res = 0
for i in range(n):
    if int(input()) == 1:
        res += 1
    else:
        res -= 1
if res > 0:
    print('Junhee is cute!')
elif res < 0:
    print('Junhee is not cute!')
