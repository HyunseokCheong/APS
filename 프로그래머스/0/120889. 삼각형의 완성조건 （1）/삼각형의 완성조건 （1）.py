def solution(sides):
    answer = 1
    
    max_side = max(sides)
    sum_side = sum(sides)
    
    if sum_side - max_side <= max_side:
        answer = 2
        
    return answer