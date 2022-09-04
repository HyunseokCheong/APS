A, B, D = map(int, input().split())
li = [1]*(B+1)
for i in range(2, int(B**0.5)+1):
    if li[i]:
        for j in range(i+i, B+1, i):
            li[j] = 0
prime = [i for i in range(A, B+1) if li[i]]
cnt = 0
for n in prime:
    if str(D) in str(n):
        cnt += 1
print(cnt)