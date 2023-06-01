alphabet = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
word = input()
time = 0

for i in alphabet:
    for j in i:
        for k in word:
            if j == k:
                time += alphabet.index(i) + 3
print(time)