def solution(my_string, is_suffix):
    suffix = []
    
    n = len(my_string)
    for start in range(n):
        suffix.append(my_string[start:n])
        
    return 1 if is_suffix in suffix else 0
