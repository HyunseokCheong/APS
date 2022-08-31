for tc in range(int(input())):
    N = int(input())
    word = input()
    name_list = ['T', 'i', 'm', 'u', 'r']

    answer = 'NO'
    if len(word) == 5:
        word = set(word)
        cnt = 0
        for i in word:
            if i in name_list:
                cnt += 1
        if cnt == 5:
            answer = 'YES'
    else:
        answer = 'NO'

    print(answer)
