'''
근의 공식
(X + 3) * (X + 3) = 0
X^2 + 6X + 9 = 0
X = -3

문제에서 주어진 식에 대입
X^2 + 2AX + B

역으로 생각하면 B는 X들의 곱셈
X의 범위는 B의 -제곱근 ~ +제곱근
찾은 범위로 문제풀이
'''
A, B = map(int, input().split())

for X in range(int(-1000 ** 0.5), int(1000 ** 0.5)):
    if X ** 2 + (2 * A * X) + B == 0:
        print(X, end=' ')
