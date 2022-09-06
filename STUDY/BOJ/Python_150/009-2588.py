import sys

input = sys.stdin.readline

# A는 정수로 받고 B는 문자열로 받아서 자리별로 계산값을 구한다.
A = int(input())
B = input()
Q3 = int(B[2]) * A
Q4 = int(B[1]) * A
Q5 = int(B[0]) * A
Q6 = int(B) * A
print(Q3, Q4, Q5, Q6, sep='\n')