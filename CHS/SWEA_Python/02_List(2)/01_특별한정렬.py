import sys

sys.stdin = open('01_특별한정렬.txt')

for tc in range(int(input())):
    N = int(input())
    nums = list(map(int, input().split()))

    for i in range(N - 1, 0, -1):
        for j in range(0, i):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]

    answer = []
    for i in range(10):
        if i % 2 == 0:
            answer.append(nums[-1 - i // 2])
        else:
            answer.append(nums[0 + i // 2])

    print(f'#{tc + 1}', *answer, end=' ')
    print()