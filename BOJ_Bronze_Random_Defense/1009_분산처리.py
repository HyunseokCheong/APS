import sys; input = sys.stdin.readline
for tc in range(int(input())):
    A, B = map(int, input().split())

    answer = (A ** B) % 10

    print(answer)