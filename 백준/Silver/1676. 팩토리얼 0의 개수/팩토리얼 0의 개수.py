def facto(x):
    if x == 1:
        return 1
    else:
        return x * facto(x - 1)


num = int(input())
if num == 0:
    print(0)
    exit()
num = facto(num)

str_num = str(num)
n = len(str_num)
cnt = 0
for i in range(n - 1, -1, -1):
    if str_num[i] == '0':
        cnt += 1
    else:
        break
print(cnt)
