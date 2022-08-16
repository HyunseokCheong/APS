for tc in range(int(input())):
    li = list(input().split('()'))
    temp = 0
    answer = 0
    for i in range(0, len(li)):
        answer += temp
        for j in range(0, len(li[i])):
            if li[i][j] == '(':
                temp += 1
            elif li[i][j] == ')':
                temp -= 1
                answer += 1
    print(f'#{tc + 1} {answer}')