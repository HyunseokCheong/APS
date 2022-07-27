alpha = [0] * 26
N = int(input())
word = input() + 'z'

left = 0
right = 0
ans = 0
type_cnt = 1
current_len = 1
alpha[ord(word[0]) - ord('a')] += 1

while left < len(word) - 1 and right < len(word) - 1:
    if type_cnt <= N:
        if ans < current_len:
            ans