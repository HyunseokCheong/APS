import sys

input = sys.stdin.readline

T = int(input())
for i in range(T):
    N = int(input())
    max_univ = ''
    max_alcohol = 0
    for j in range(N):
        univ, alcohol = input().split()
        alcohol = int(alcohol)
        if alcohol > max_alcohol:
            max_univ = univ
            max_alcohol = alcohol
    print(max_univ)
