def recur(depth, number):
    global max_number, min_number
    if depth == n:
        max_number = max(max_number, number)
        min_number = min(min_number, number)
        return
    next_number = number_list[depth]
    next_number_list = [number + next_number, number - next_number, number * next_number, int(number / next_number)]
    for i in range(4):
        if operator[i] > 0:
            operator[i] -= 1
            recur(depth + 1, next_number_list[i])
            operator[i] += 1


n = int(input())
number_list = list(map(int, input().split()))
operator = list(map(int, input().split()))

max_number = -100_000_000
min_number = 100_000_000

recur(1, number_list[0])
print(max_number, min_number, sep="\n")
