n = int(input())
vote = input()
score = 0
for i in vote:
    if i == 'A':
        score += 1
    else:
        score -= 1

if score > 0:
    print('A')
elif score < 0:
    print('B')
else:
    print('Tie')
