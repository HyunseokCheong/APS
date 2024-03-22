def solution(myString):
    answer = []
    
    data = myString.split('x')
    for a in data:
        answer.append(len(a))
    
    return answer