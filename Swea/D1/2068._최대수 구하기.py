T = int(input())
for i in range(T):
    nums = list(map(int, input().split()))
    print(f'#{i + 1} {max(nums)}')
