import sys

input = sys.stdin.readline
# 유클리드 호제법

def gcd(a, b): # 최대공약수 구하기
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b): # 최소공배수 구하기
    return (a * b) // gcd(a, b)

T = int(input())
for i in range(T):
    a, b = map(int, input().split())
    print(lcm(a, b))