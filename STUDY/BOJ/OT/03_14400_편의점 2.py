'''
택시 거리
|x1 - x2| + |y1 - y2|

1 <= N <= 100,000
-1,000,000 <= X, Y <= 1,000,000
'''
N = int(input())
mat = [list(map(int, input().split())) for _ in range(N)]


# X좌표 정렬, X중간 좌표 설정
mat.sort(key=lambda x: x[0])
X = mat[N // 2][0]

# Y좌표 정렬, Y중간 좌표 설정
mat.sort(key=lambda x: x[1])
Y = mat[N // 2][1]

# 거리 계산
dist = 0
for i in range(N):
    dist += abs(mat[i][0] - X) + abs(mat[i][1] - Y)
print(dist)