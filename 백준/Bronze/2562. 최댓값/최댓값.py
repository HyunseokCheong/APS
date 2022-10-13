mxv, mxi = 0, 0
for i in range(9):
    num = int(input())
    if num > mxv:
        mxv = num
        mxi = i + 1
print(mxv, mxi, sep='\n')
