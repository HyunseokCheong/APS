for tc in range(10):
    N = int(input())
    word = input()

    # 중위 -> 후위 변환하여 문자열로 반환
    # 우선순위: 괄호 > 곱셈 > 덧셈
    temp_list = []
    temp = ''
    for i in word:
        # 숫자인 경우, 문자열에 추가
        if i.isdigit():
            temp += i
        else:
            # 여는 괄호인 경우, 리스트에 추가
            if i == '(':
                temp_list.append(i)
            # 괄호를 제외하고 곱셈 보다 우선순위가 높은 연산은 먼저 나온 곱셈이다.
            # 곱셈인 경우, 리스트의 탑이 곱셈인 동안 리스트의 탑(곱셈)을 문자열에 추가
            # 리스트에 곱셈을 추가
            elif i == '*':
                while temp_list and temp_list[-1] == '*':
                    temp += temp_list.pop()
                temp_list.append(i)
            # 괄호를 제외하고 덧셈 보다 우선순위가 높은 연산은 곱셈과 먼저 나온 덧셈이다.
            # 덧셈인 경우, 리스트의 탑이 여는 괄호가 아닌 동안 리스트의 탑을 문자열에 추가
            # 리스트에 덧셈을 추가
            elif i == '+':
                while temp_list and temp_list[-1] != '(':
                    temp += temp_list.pop()
                temp_list.append(i)
            # 닫는 괄호인 경우, 리스트의 탑이 여는 괄호가 아닌 동안 리스트의 탑을 문자열에 추가
            # 리스트의 탑(여는 괄호)을 제거
            elif i == ')':
                while temp_list and temp_list[-1] != '(':
                    temp += temp_list.pop()
                temp_list.pop()
    # 괄호에 포함되지 않은 연산자들이 리스트에 남아있을 것이다.
    # 리스트에 남은 값을 문자열에 추가
    while temp_list:
        temp += temp_list.pop()
    # 리스트는 비어있고 문자열은 후위 표기식으로 변환 완료
    
    # 스택을 만들고 후위 표기법에 맞게 계산을 진행한다.
    stack = []
    for i in temp:
        if i.isdigit():
            stack.append(int(i))
        elif i == '+':
            stack.append(stack.pop() + stack.pop())
        elif i == '*':
            stack.append(stack.pop() * stack.pop())

    print(f'#{tc + 1} {stack.pop()}')
