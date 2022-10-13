def solution(numbers, direction):
    if direction == 'right':
        numbers.insert(0, numbers.pop())
        return numbers
    numbers.append(numbers.pop(0))
    return numbers
