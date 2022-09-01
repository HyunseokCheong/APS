def recur(depth, idx):
    if depth == L:
        vowel = 0
        consonant = 0
        for i in range(L):
            if arr[i] in 'aeiou':
                vowel += 1
            else:
                consonant += 1
        if vowel >= 1 and consonant >= 2:
            print(''.join(arr))
        return
    for i in range(idx, C):
        if visited[i] == 0:
            arr.append(word[i])
            visited[i] = 1
            recur(depth + 1, i + 1)
            visited[i] = 0
            arr.pop()


L, C = map(int, input().split())
visited = [False for i in range(C)]
arr = []
word = list(input().split())
word.sort()

recur(0, 0)
