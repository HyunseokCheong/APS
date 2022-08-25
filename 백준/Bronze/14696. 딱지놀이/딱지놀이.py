for tc in range(int(input())):
    A_list = list(map(int, input().split()))
    B_list = list(map(int, input().split()))

    fight_list = [0] * 4
    for i in range(1, len(A_list)):
        if A_list[i] == 4:
            fight_list[0] += 1
        elif A_list[i] == 3:
            fight_list[1] += 1
        elif A_list[i] == 2:
            fight_list[2] += 1
        elif A_list[i] == 1:
            fight_list[3] += 1
    for i in range(1, len(B_list)):
        if B_list[i] == 4:
            fight_list[0] -= 1
        elif B_list[i] == 3:
            fight_list[1] -= 1
        elif B_list[i] == 2:
            fight_list[2] -= 1
        elif B_list[i] == 1:
            fight_list[3] -= 1

    for i in fight_list:
        if i > 0:
            print('A')
            break
        elif i < 0:
            print('B')
            break
        else:
            continue
    else:
        print('D')