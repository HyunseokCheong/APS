N = int(input())
nums = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())

max_val = -1e9
min_val = 1e9


def solve(depth, temp):
    global add, sub, mul, div, max_val, min_val
    if depth == N:
        max_val = max(max_val, temp)
        min_val = min(min_val, temp)
    else:
        if add > 0:
            add -= 1
            solve(depth + 1, temp + nums[depth])
            add += 1
        if sub > 0:
            sub -= 1
            solve(depth + 1, temp - nums[depth])
            sub += 1
        if mul > 0:
            mul -= 1
            solve(depth + 1, temp * nums[depth])
            mul += 1
        if div > 0:
            div -= 1
            solve(depth + 1, int(temp / nums[depth]))
            div += 1


solve(1, nums[0])

print(max_val, min_val, sep='\n')
