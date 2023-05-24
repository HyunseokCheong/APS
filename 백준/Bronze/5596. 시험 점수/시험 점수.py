a_score = list(map(int, input().split()))
b_score = list(map(int, input().split()))
print(max(sum(a_score), sum(b_score)))
