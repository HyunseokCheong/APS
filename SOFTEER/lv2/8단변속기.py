sq = list(map(int, input().split()))

ascending = list(range(1, 9))
descending = list(range(8, 0, -1))

if sq == ascending:
    print('ascending')
elif sq == descending:
    print('descending')
else:
    print('mixed')