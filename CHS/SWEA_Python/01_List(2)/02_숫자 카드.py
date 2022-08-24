import sys

sys.stdin = open('02_숫자 카드.txt')
for tc in range(int(input())):
    N = int(input())
    nums = list(input())

    max_cnt = 0
    max_num = 0

    for i in range(0, N):
        cnt = 0
        num = 0

        for j in range(0, N):
            if nums[i] == nums[j]:
                cnt += 1
                num = nums[i]
        if cnt > max_cnt or (cnt == max_cnt and num > max_num):
            max_cnt = cnt
            max_num = num

    print(f'#{tc + 1} {max_num} {max_cnt}')