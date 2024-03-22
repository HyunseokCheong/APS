def solution(my_string, alp):
    answer = ''
    
    for data in my_string:
        if data == alp:
            answer += data.upper()
        else:
            answer += data
            
    return answer