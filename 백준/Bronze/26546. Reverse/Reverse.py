number_of_word = int(input())
for i in range(number_of_word):
    word, s, e = input().split()
    # s ~ e 는 생략하고 출력
    s = int(s)
    e = int(e)
    for j in range(len(word)):
        if j in range(s, e):
            continue
        print(word[j], end='')
    print()