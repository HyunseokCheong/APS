arr = [-1] * (ord('z') - ord('a') + 1)
word = input()
N = len(word)
for i in range(0, N):
    if arr[ord(word[i]) - 97] == -1:
        arr[ord(word[i]) - 97] = i

print(*arr)
