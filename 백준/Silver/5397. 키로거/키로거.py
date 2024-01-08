n = int(input())
for _ in range(n):
    left = []
    right = []
    data = input()
    for d in data:
        if d == '<' and left:
            right.append(left.pop())
        elif d == '>' and right:
            left.append(right.pop())
        elif d == '-' and left:
            left.pop()
        elif d != '<' and d != '>' and d != '-':
            left.append(d)
    left.extend(reversed(right))
    print(''.join(left))