t = int(input())
for i in range(t):
    arr = sorted(list(map(int, input().split())))
    sum_arr = 0
    min_even = 0
    for num in arr:
        if num % 2 == 0:
            sum_arr += num
            if min_even == 0:
                min_even = num
    print(sum_arr, min_even)