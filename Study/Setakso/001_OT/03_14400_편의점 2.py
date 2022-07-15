N = int(input())
arr = []

for i in range(N):
    points = list(map(int, input().split()))
    arr.append(points)

# X좌표 정렬, X중간 좌표 설정
arr.sort(key=lambda x: x[0])
X = arr[N // 2][0]

# Y좌표 정렬, Y중간 좌표 설정
arr.sort(key=lambda x: x[1])
Y = arr[N // 2][1]

# 거리 계산
dist = 0
for i in range(N):
    dist += abs(arr[i][0] - X) + abs(arr[i][1] - Y)
print(dist)