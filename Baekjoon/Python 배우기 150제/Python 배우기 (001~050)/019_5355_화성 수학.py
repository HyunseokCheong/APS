T = int(input())
for i in range(T):
    mars = list(map(str, input().split()))
    answer = 0
    for j in range(len(mars)):
        if j == 0:
            answer += float(mars[j])
        else:
            if mars[j] == '@':
                answer *= 3
            elif mars[j] == '%':
                answer += 5
            elif mars[j] == '#':
                answer -= 7
    print('%0.2f' % answer)
