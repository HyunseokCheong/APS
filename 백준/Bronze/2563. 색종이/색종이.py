'''
2563
색종이
N <= 100
W = H = 100
'''
board = [[0] * 101 for _ in range(101)]
N = int(input())
ans = 0
for i in range(N):
    L, B = map(int, input().split())
    for row in range(B, B + 10):
        for col in range(L, L + 10):
            if board[row][col] == 0:
                board[row][col] = 1
                ans += 1

print(ans)