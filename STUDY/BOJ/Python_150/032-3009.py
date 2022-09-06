import sys

input = sys.stdin.readline

X_point = []
Y_point = []
for i in range(3):
    X, Y = map(int, input().split())
    X_point.append(X)
    Y_point.append(Y)

for i in range(3):
    if X_point.count(X_point[i]) == 1:
        x4 = X_point[i]
    if Y_point.count(Y_point[i]) == 1:
        y4 = Y_point[i]
print(x4, y4)