t = int(input())
for i in range(t):
    a, b, c = map(int, input().split())

    if a + b + c - max(a, b, c) <= max(a, b, c):
        answer = "invalid!"
    elif a == b == c:
        answer = "equilateral"
    elif a == b or a == c or b == c:
        answer = "isosceles"
    else:
        answer = "scalene"

    print(f'Case #{i + 1}: {answer}')