pass_list = ['i', 'pa', 'te', 'ni', 'niti', 'a', 'ali', 'nego', 'no', 'ili']
word_list = list(input().split())
answer = ''
for i in word_list:
    if i in pass_list and answer:
        continue
    answer += i[0].upper()
print(answer)
