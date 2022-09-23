def bin_to_dec(x_list, idx):
    new_bin = x_list[:]
    new_bin[idx // 2] = str(idx % 2)
    return int(''.join(new_bin), 2)


def ter_to_dec(x_list, idx):
    new_tri = x_list[:]
    new_tri[idx // 3] = str(idx % 3)
    return int(''.join(new_tri), 3)


t = int(input())
for tc in range(t):
    bin_input = list(input())
    tri_input = list(input())
    
    # 탈출 체크
    check = False

    # 2진법의 길이만큼 반복
    for i in range(len(bin_input) * 2):
        
        # 3진법의 길이만큼 반복
        for j in range(len(tri_input) * 3):
            
            # 2진법과 3진법이 같으면 탈출
            if bin_to_dec(bin_input, i) == ter_to_dec(tri_input, j):
                print(f'#{tc + 1} {bin_to_dec(bin_input, i)}')
                check = True
                break
        # 탈출 체크
        if check:
            break