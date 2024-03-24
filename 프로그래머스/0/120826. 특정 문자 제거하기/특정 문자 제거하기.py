def solution(my_string, letter):
    answer = ''
    
    for data in my_string:
        if data == letter:
            continue
        answer += data
    
    return answer