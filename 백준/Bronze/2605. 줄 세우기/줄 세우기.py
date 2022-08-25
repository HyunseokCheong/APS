N = int(input())
nums = list(map(int, input().split()))

board = []
for i in range(0, N):
    board.insert(i - nums[i], i + 1)

print(*board)