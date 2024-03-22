def solution(my_string):
    answer = ''
    
    for data in my_string:
        if data.isupper():
            answer += data.lower()
        else:
            answer += data.upper()
            
    return answer