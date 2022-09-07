arr = [['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I'], ['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R', 'S'],
       ['T', 'U', 'V'], ['W', 'X', 'Y', 'Z']]

word = input()
answer = 0
for i in word:
    for j in arr:
        if i in j:
            answer += arr.index(j) + 3

print(answer)