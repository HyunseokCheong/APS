T = int(input())
for i in range(T):
    Y = 0
    K = 0
    for j in range(9):
        score_Y, score_K = map(int, input().split())
        Y += score_Y
        K += score_K
    if Y > K:
        print("Yonsei")
    elif Y < K:
        print("Korea")
    elif Y == K:
        print("Draw")