word = input()
N = len(word)
for i in range(1, N + 1):
    print(word[i - 1], end='')
    if i % 10 == 0:
        print()