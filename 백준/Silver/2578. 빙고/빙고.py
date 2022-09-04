def bingo(arr):
    cnt = 0

    # 가로 확인
    for k in arr:
        if k.count(0) == 5:
            cnt += 1

    # 세로 확인
    for k in range(5):
        temp = 0
        for l in range(5):
            if arr[l][k] == 0:
                temp += 1
            if temp == 5:
                cnt += 1

    # 대각선 확인
    temp1 = 0
    temp2 = 0
    for k in range(5):
        if arr[k][k] == 0:
            temp1 += 1
        if arr[k][4 - k] == 0:
            temp2 += 1
    if temp1 == 5:
        cnt += 1
    if temp2 == 5:
        cnt += 1

    return cnt

# 입력
player = [list(map(int, input().split())) for _ in range(5)]
temp_list = [list(map(int, input().split())) for _ in range(5)]

# 1차원 리스트 생성
dealer = []
for i in temp_list:
    for j in i:
        dealer.append(j)

for idx, num in enumerate(dealer):
    for i in player:
        if num in i:
            i[i.index(num)] = 0
            break
    res = bingo(player)
    if res >= 3:
        print(idx + 1)
        break
