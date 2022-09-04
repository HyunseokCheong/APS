W = []
K = []

for i in range(10):
    wscore = int(input())
    W.append(wscore)

for i in range(10):
    kscore = int(input())
    K.append(kscore)

W.sort()
K.sort()

print(sum(W[7:10]), sum(K[7:10]))