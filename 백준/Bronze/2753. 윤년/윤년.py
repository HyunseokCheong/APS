year = int(input())
flag = False

if year % 4 == 0 and year % 100 != 0:
    flag = True

if year % 400 == 0:
    flag = True

if flag:
    print(1)
else:
    print(0)