def recur(depth, arr):
    line[sum(arr)] = 1
    if depth == n:
        return

    arr.append(seq[depth])
    recur(depth + 1, arr)
    arr.pop()
    recur(depth + 1, arr)


line = [0 for _ in range(2000001)]

n = int(input())
seq = list(map(int, input().split()))

recur(0, [])

for i in range(len(line)):
    if line[i] == 0:
        print(i)
        break