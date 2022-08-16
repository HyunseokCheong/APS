n = int(input())
li = list(map(int, input().split()))

c = 0
to_check = -1
for i in range(n - 1):
    if li[i] > li[i + 1]:
        to_check = i
        c += 1
    
if c == 0:
    print(n)
else:
    ip = True
    nli = li.copy()
    del nli[to_check]
    if sorted(nli) != nli:
        if to_check + 1 >= n:
            ip = False
        else:
            nli = li.copy()
            del nli[to_check + 1]
            if sorted(nli) != nli:
                ip = False
        
    if not ip:
        print(0)
    else:
        sli = sorted(li)

        diff_s = -1
        diff_e = 0
        for i in range(n):
            if li[i] != sli[i]:
                if diff_s == -1:
                    diff_s = i
                diff_e = i
        if diff_e - diff_s == 1:
            print(2)
        else:
            print(1)