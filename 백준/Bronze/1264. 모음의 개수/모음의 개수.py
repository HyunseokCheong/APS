voewl = ['a', 'e', 'i', 'o', 'u']
while True:
    word = input().lower()
    if word == '#':
        break
    cnt = 0
    for i in word:
        if i in voewl:
            cnt += 1
    print(cnt)