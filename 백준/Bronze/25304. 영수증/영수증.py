X = int(input())
for _ in range(int(input())):
    A, B = map(int, input().split())
    X -= A * B
if X == 0:
    print('Yes')
else:
    print('No')