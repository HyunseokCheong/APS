'''
5
3
1
'''


def solution(hp):
    num5 = int(hp / 5)
    num3 = int((hp - num5 * 5) / 3)
    num1 = hp - num5 * 5 - num3 * 3
    return num1 + num3 + num5
