'''
1. 16진수 찾기
2. 16진수 -> 2진수
3. 2진수 -> 비율
4. 비율 -> 10진수
5. 10진수 검증
'''
code = {(2, 1, 1): 0, (2, 2, 1): 1, (1, 2, 2): 2, (4, 1, 1): 3, (1, 3, 2): 4, (2, 3, 1): 5, (1, 1, 4): 6, (3, 1, 2): 7,
        (2, 1, 3): 8, (1, 1, 2): 9,
        }

for tc in range(int(input())):
    row, col = map(int, input().split())
    # 1. 16진수 찾기
    target_hex = sorted(list(set([input() for _ in range(row)])))[1:]

    odd = even = cnt = 0
    ans = 0
    ans_list = []

    # 2. 16진수 -> 2진수
    for i in target_hex:
        target_bin = format(int(i, 16), 'b').lstrip('0') + '0'

        # 3. 2진수 -> 비율
        r1 = r2 = r3 = 0
        res = ''
        for j in target_bin:
            if j == '1' and r2 == 0:
                r1 += 1
            elif j == '0' and r1 != 0 and r3 == 0:
                r2 += 1
            elif j == '1' and r2 != 0:
                r3 += 1
            elif r3 != 0:

                # 4. 비율 -> 10진수
                r = min(r1, r2, r3)
                target_dec = code[(r1 // r, r2 // r, r3 // r)]
                res += str(target_dec)

                # 5. 10진수 검증
                cnt += 1
                if cnt == 8:
                    if (odd * 3 + even + target_dec) % 10 == 0 and res not in ans_list:
                        ans += odd + even + target_dec
                    ans_list.append(res)
                    odd = even = cnt = 0
                    res = ''
                elif cnt % 2 == 0:
                    even += target_dec
                elif cnt % 2 == 1:
                    odd += target_dec
                r1 = r2 = r3 = 0
    print(f'#{tc + 1} {ans}')