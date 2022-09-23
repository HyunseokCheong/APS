'''
1 <= N <= 100
0 <= time <= 1000
'''

N = int(input())
temp = []
for i in range(N):
    S, E = map(int, input().split())
    temp.append([S, E])

mxv = 0
for i in range(N):
    time_list = [0] * 1001
    for j in range(N):
        if i != j:
            for k in range(temp[j][0], temp[j][1]):
                time_list[k] = 1
    val = sum(time_list)
    if val > mxv:
        mxv = val
print(mxv)
