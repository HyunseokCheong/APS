T = int(input())
for tc in range(T):
    dice1, dice2 = map(int, input().split())
    print(f'Case {tc + 1}: {dice1 + dice2}')