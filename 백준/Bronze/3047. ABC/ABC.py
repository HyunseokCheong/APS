nums = list(map(int, input().split()))
nums.sort()
A = nums[0]
B = nums[1]
C = nums[2]

word = input()

for i in word:
    if i == 'A':
        print(A, end=' ')
    elif i == 'B':
        print(B, end=' ')
    elif i == 'C':
        print(C, end=' ')