N = int(input())
arr = []
for i in range(N):
    arr.append(int(input()))

inc = 1
inc_height = arr[0]
for i in range(0, N):
    if arr[i] > inc_height:
        inc += 1
        inc_height = arr[i]
print(inc)

dec = 1
dec_height = arr[-1]
for i in range(N - 1, -1, -1):
    if arr[i] > dec_height:
        dec += 1
        dec_height = arr[i]
print(dec)