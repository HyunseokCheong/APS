N, K = map(int, input().split())

temp = []
for i in range(N):
    temp.append(list(map(int, input().split())))

same_target = 0
over_target = 0
for i in range(N):
    for j in range(N):
        if temp[i][j] == K:
            same_target += 1
        elif temp[i][j] > K:
            over_target += 1

answer = 1
if same_target >= 1 and over_target >= 2:
    answer = 2
    over_i_list = []
    over_j_list = []
    same_i_list = []
    same_j_list = []
    for i in range(N):
        for j in range(N):
            if temp[i][j] > K:
                over_i_list.append(i)
                over_j_list.append(j)
            elif temp[i][j] == K:
                same_i_list.append(i)
                same_j_list.append(j)
    for i in range(0, len(over_i_list) + 1):
        for j in range(0, len(over_i_list) + 1):
            temp[i][j] = N ** 2 + 1
    cnt = 0
    for i in range(0, len(same_i_list)):
        if temp[same_i_list[i]][same_j_list[i]] != N ** 2 + 1:
            cnt += 1
    if cnt > 0:
        answer = 1

elif same_target >= 1 and over_target == 1:
    answer = 1
elif same_target == 0 and over_target == 0:
    answer = 1
elif same_target >= 1 and over_target == 0:
    answer = 0

print(answer)