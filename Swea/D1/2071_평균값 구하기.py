T = int(input())
for i in range(T):
    nums = list(map(int, input().split()))
    answer = sum(nums) / 10
    print(f'#{i + 1} {answer:.0f}')
