MHSJ = []
for i in range(4):
    score = int(input())
    MHSJ.append(score)

YJ = []
for i in range(2):
    score = int(input())
    YJ.append(score)

score = 0
MHSJ.sort()
YJ.sort()
score += sum(MHSJ[1:4]) + YJ[1]
print(score)
