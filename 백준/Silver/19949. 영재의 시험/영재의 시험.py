# 1, 2, 3, 4, 5 중 하나를 선택
# 전, 전전과 같은 답은 고를 수 없다.
# 5점 이상인 경우 + 1
def recur(depth):
    global count_over_five
    if depth == 10:
        score = 0
        for i in range(10):
            if answer_list[i] == current_list[i]:
                score += 1
                if score >= 5:
                    count_over_five += 1
                    break
        return
    for i in range(1, 6):
        if depth > 1 and current_list[depth - 1] == i and current_list[depth - 2] == i:
            continue
        current_list.append(i)
        recur(depth + 1)
        current_list.pop()


answer_list = list(map(int, input().split()))
current_list = []
count_over_five = 0
recur(0)
print(count_over_five)
