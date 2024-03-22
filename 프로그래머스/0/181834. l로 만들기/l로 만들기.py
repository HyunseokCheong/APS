def solution(myString):
    answer = ''
    
    for data in myString:
        if data < 'l':
            answer += 'l'
        else:
            answer += data
    
    return answer