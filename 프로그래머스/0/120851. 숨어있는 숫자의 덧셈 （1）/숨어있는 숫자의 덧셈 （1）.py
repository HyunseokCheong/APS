def solution(my_string):
    answer = 0
    
    for data in my_string:
        if '0' <= data <= '9':
            answer += int(data)
    
    return answer