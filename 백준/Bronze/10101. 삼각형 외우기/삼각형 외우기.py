def solve(arr):
    global ans
    if sum(arr) != 180:
        ans = 'Error'
        return
    else:
        res = len(set(arr))
        if res == 1:
            ans = 'Equilateral'
        elif res == 2:
            ans = 'Isosceles'
        else:
            ans = 'Scalene'
        return


arr = [0] * 3
for i in range(3):
    arr[i] = int(input())

ans = ''
solve(arr)
print(ans)
