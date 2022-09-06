import sys

input = sys.stdin.readline

score_A = 100
score_B = 100
N = int(input())
for i in range(N):
    A, B = map(int, input().split())
    if A > B:
        score_B -= A
    elif A < B:
        score_A -= B
print(score_A, score_B, sep='\n')