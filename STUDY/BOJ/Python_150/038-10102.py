import sys

input = sys.stdin.readline

V = int(input())
vote = input()
result = 0
for i in vote:
    if i == 'A':
        result += 1
    elif i == 'B':
        result -= 1
if result > 0:
    print('A')
elif result < 0:
    print('B')
else:
    print('Tie')