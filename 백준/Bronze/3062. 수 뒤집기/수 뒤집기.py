T = int(input())
for i in range(T):
    str_num = input()
    res = str(int(str_num) + int(str_num[::-1]))
    if res == res[::-1]:
        print('YES')
    else:
        print('NO')