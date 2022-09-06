T = int(input())
for tc in range(T):
    nums = list(map(int, input().split()))
    N = nums[0]
    scores = nums[1:]
    scores.sort()
    largest_gap = 0
    for i in range(1, N):
        if scores[i] - scores[i - 1] > largest_gap:
            largest_gap = scores[i] - scores[i - 1]
    print(f'Class {tc + 1}')
    print(f'Max {max(scores)}, Min {min(scores)}, Largest gap {largest_gap}')