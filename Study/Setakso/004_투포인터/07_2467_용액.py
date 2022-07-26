import sys
input = sys.stdin.readline

N = int(input())
solutions = list(map(int, input().split()))

left = 0
right = N - 1

ansL = 0
ansR = 0

min = sys.maxsize

while left < right:
    sum = solutions[left] + solutions[right]
    if abs(sum) < min:
        ansL = left
        ansR = right
        min = abs(sum)

    if sum > 0:
        right -= 1
    elif sum < 0:
        left += 1
    else:
        break

print(solutions[ansL], solutions[ansR])
