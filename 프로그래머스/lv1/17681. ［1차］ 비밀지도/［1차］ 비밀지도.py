def solution(n, arr1, arr2):
    answer = []

    for i in range(n):
        tmp = arr1[i] | arr2[i]
        tmp = format(tmp, 'b')
        tmp = tmp.zfill(n)
        tmp = tmp.replace('1', '#')
        tmp = tmp.replace('0', ' ')
        answer.append(tmp)

    return answer
