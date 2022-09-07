'''
x좌표와 y좌표의 범위가 주어졌다. => 평면의 범위도 이와 같을 것.
평면을 설정하고 직사각형의 범위만큼 평면에 표시하는 방식으로 구현
'''
# 평면 설정
board = [[0] * 100 for _ in range(100)]

# 평면에 직사각형 표시
for i in range(4):
    x1, y1, x2, y2 = map(int, input().split())
    for j in range(x1, x2):
        for k in range(y1, y2):
            board[j][k] = 1

# 평면에서 표시된 구간 산출
answer = 0
for j in range(100):
    for k in range(100):
        if board[j][k] == 1:
            answer += 1
print(answer)
