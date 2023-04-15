w = int(input())
l = int(input())
h = int(input())

answer = 'bad'

if min(l, w) / h >= 2 >= max(l, w) / min(l, w):
    answer = 'good'

print(answer)
