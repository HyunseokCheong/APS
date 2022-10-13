def solution(cipher, code):
    ans = ''
    for i in range(len(cipher)):
        if (i + 1) % code == 0:
            ans += cipher[i]
    return ans