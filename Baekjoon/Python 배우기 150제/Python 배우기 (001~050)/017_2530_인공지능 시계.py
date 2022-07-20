A, B, C = map(int, input().split())
D = int(input())

S = (C + D) % 60
M = ((C + D) // 60 + B) % 60
H = (((C + D) // 60 + B) // 60 + A) % 24

print(H, M, S)
