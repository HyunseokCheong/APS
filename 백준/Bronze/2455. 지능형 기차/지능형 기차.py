val, mxv = 0, 0
for i in range(4):
    a, b = map(int, input().split())
    val -= a
    val += b
    mxv = max(mxv, val)
print(mxv)
