n = int(input())
ans = format(n, '#x')[2:].upper()
if len(str(ans)) == 1:
    print('0' + str(ans))
else:
    print(str(ans))