import string

if __name__ == "__main__":
    n = int(input())
    stack = []
    s = input()
    arr = [int(input()) for _ in range(n)]
    
    for i in s:
        if i in string.ascii_uppercase:
            stack.append(arr[ord(i) - ord('A')])
        else:
            first = stack.pop()
            second = stack.pop()
            stack.append(eval(f'{second}{i}{first}'))
    print(f'{stack[0]:.2f}')