def solution(strArr):
    answer = []
    
    for data in strArr:
        if not 'ad' in data:
            answer.append(data)
    
    return answer