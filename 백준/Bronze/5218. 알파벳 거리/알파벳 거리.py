T = int(input())
for i in range(T):
    S = []
    X, Y = map(list, input().split())
    for j in range(len(X)):
        if ord(X[j]) <= ord(Y[j]):
            S.append(ord(Y[j]) - ord(X[j]))
        else:
            S.append(ord(Y[j]) + 26 - ord(X[j]))
    print('Distances: ', end='')
    for j in S:
        print(j, end=' ')
    print()