'''
array = [1, 5, 2, 6, 3, 7, 4]
commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]
return = [5, 6, 3]
'''


def solution(array, commands):
    ans = []
    for command in commands:
        i, j, k = command[0], command[1], command[2]
        res = sorted(array[i - 1:j])[k - 1]
        ans.append(res)
    return ans
