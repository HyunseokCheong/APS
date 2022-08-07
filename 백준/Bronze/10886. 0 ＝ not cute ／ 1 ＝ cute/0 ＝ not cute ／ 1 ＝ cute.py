N = int(input())
cute = 0
for i in range(N):
    num = int(input())
    if num == 1:
        cute += 1
    elif num == 0:
        cute -= 1
if cute > 0:
    print('Junhee is cute!')
else:
    print('Junhee is not cute!')