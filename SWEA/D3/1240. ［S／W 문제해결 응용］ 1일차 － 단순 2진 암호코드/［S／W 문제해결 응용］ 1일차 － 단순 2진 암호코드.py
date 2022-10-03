pwd = {
    '0001101': 0, '0011001': 1, '0010011': 2, '0111101': 3, '0100011': 4,
    '0110001': 5, '0101111': 6, '0111011': 7, '0110111': 8, '0001011': 9
}
t = int(input())
for tc in range(t):
    n, m = map(int, input().split())

    for i in range(n):
        temp = input()
        if int(temp) != 0:
            nums = temp

    eni = 0
    for idx in range(len(nums) - 1, -1, -1):
        if nums[idx] == '1':
            eni = idx
            break
    sti = eni - 55

    code = [0] * 8
    for i in range(sti, eni + 1, 7):
        code[(i - sti) // 7] = pwd[nums[i:i + 7]]

    odd = code[0] + code[2] + code[4] + code[6]
    even = code[1] + code[3] + code[5] + code[7]

    if (odd * 3 + even) % 10 == 0:
        print(f'#{tc + 1} {odd + even}')
    else:
        print(f'#{tc + 1} 0')