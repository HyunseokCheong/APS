dic = {'2': '0', '0': '5', '5': '2'}


def solution(rsp):
    ans = ''
    for i in rsp:
        ans += dic[i]
    return ans
