T = int(input())
for i in range(T):
    N = bin(int(input()))[2:]
    for j in range(len(N)):
        if N[-j-1] == '1':
            print(j, end=' ')