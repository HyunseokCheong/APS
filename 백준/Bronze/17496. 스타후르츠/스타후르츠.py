'''
N 여름의 일 수
T 자라는데 걸리는 일 수
C 칸 수
P 가격
'''
N, T, C, P = map(int, input().split())
ans = ((N - 1) // T) * C * P
print(ans)