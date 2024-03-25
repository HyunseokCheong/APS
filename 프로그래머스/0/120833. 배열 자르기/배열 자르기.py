def solution(numbers, num1, num2):
    answer = []
    
    for idx in range(num1, num2 + 1):
        answer.append(numbers[idx])
        
    return answer