N = int(input())
S = input()
vowel = ['a', 'i', 'u', 'e', 'o']
count = 0

for i in range(N):
    if S[i] in vowel:
        count += 1

print(count)