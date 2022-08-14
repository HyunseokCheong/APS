word = input()
answer = 0

for i in word:
    if i in ['a', 'e', 'i', 'o', 'u']:
        answer += 1

print(answer)