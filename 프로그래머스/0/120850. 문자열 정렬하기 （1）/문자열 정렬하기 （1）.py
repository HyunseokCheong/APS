def solution(my_string):
    answer = []
    
    for data in my_string:
        if '0' <= data <= '9':
            answer.append(int(data))
    answer.sort()
    
    return answer