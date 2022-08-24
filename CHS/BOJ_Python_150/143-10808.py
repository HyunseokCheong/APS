word = input()
alphabet = [0] * 26
for i in range(0, len(word)):
    alphabet[ord(word[i]) - 97] += 1
print(*alphabet)