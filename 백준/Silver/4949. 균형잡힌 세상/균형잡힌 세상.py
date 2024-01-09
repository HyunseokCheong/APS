while True:
    data = input()
    if data == ".":
        break

    flag = True
    stack = []
    for d in data:
        if d == "(":
            stack.append("(")
        if d == "[":
            stack.append("[")
        if d == ")":
            if not stack or stack.pop() != "(":
                flag = False
                break
        if d == "]":
            if not stack or stack.pop() != "[":
                flag = False
                break
    if stack:
        flag = False

    if flag:
        print("yes")
    else:
        print("no")