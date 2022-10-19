size = {'S': 1, 'M': 2, 'L': 3}

t = int(input())
for tc in range(t):
    a, b = input().split()
    if a == b:
        print('=')
        continue
    elif size[a[-1]] > size[b[-1]]:
        print('>')
    elif size[a[-1]] < size[b[-1]]:
        print('<')
    elif size[a[-1]] == size[b[-1]]:
        if a[-1] == 'S':
            if len(a) > len(b):
                print('<')
            else:
                print('>')
        else:
            if len(a) > len(b):
                print('>')
            else:
                print('<')
