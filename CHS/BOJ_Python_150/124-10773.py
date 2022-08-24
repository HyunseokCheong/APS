arr = []
for tc in range(int(input())):
    N = int(input())
    if N == 0:
        arr.pop()
    else:
        arr.append(N)
print(sum(arr))