word = input()
vowel = ['a', 'e', 'i', 'o', 'u']
cnt = 0
for i in word:
    for j in vowel:
        if i == j:
            cnt += 1
print(cnt)