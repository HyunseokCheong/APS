N = int(input())
N_nums = set(map(int, input().split()))
M = int(input())
M_nums = list(map(int, input().split()))
for i in M_nums:
    if i in N_nums:
        print(1)
    else:
        print(0)