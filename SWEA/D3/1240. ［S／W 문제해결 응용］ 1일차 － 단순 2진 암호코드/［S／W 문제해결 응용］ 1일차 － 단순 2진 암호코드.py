'''
1 <= N <= 50
56 <= M <= 100
'''
pwd = {
    '0001101': 0, '0011001': 1, '0010011': 2, '0111101': 3, '0100011': 4,
    '0110001': 5, '0101111': 6, '0111011': 7, '0110111': 8, '0001011': 9
}
ans = []

for tc in range(int(input())):
    N, M = map(int, input().split())

    # 암호 행 찾기
    nums = 0
    for i in range(N):
        temp = input()
        if nums != 0:
            continue
        elif int(temp) != 0:
            nums = temp

    # 암호 열 찾기
    end_idx = 0
    for idx in range(len(nums) - 1, -1, -1):
        if nums[idx] == '1':
            end_idx = idx
            break
    start_idx = end_idx - 56 + 1

    # 암호 변환
    codes = []
    for i in range(start_idx, end_idx, 7):
        codes.append(pwd[nums[i:i + 7]])
    odd = codes[0] + codes[2] + codes[4] + codes[6]
    even = codes[1] + codes[3] + codes[5] + codes[7]

    if (odd * 3 + even) % 10 != 0:
        ans.append([tc + 1, 0])
    else:
        ans.append([tc + 1, odd + even])

for i in ans:
    print(f'#{i[0]} {i[1]}')