def recur(depth, idx):
    if depth == C:
        if idx == L:
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
    else:
        arr.append(word[depth])
        recur(depth + 1, idx + 1)
        arr.pop()
        recur(depth + 1, idx)


L, C = map(int, input().split())
word = sorted(input().split())
arr = []
recur(0, 0)