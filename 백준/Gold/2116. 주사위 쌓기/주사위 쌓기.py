remove_idx = [5, 3, 4, 1, 2, 0]
max_num = 0

N = int(input())
dice_tower = [list(map(int, input().split())) for _ in range(N)]

for i in range(6):
    result = []
    temp = [1, 2, 3, 4, 5, 6]
    temp.remove(dice_tower[0][i])
    next = dice_tower[0][remove_idx[i]]
    temp.remove(next)
    result.append(max(temp))

    for j in range(1, N):
        temp = [1, 2, 3, 4, 5, 6]
        temp.remove(next)
        next = dice_tower[j][remove_idx[dice_tower[j].index(next)]]
        temp.remove(next)
        result.append(max(temp))
    result = sum(result)
    if max_num < result:
        max_num = result
print(max_num)
