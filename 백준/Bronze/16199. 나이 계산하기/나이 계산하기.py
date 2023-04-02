y1, m1, d1 = map(int, input().split())
y2, m2, d2 = map(int, input().split())
'''
1. 만 나이
2. 세는 나이
3. 연 나이
'''
ans1 = (y2 * 365 + m2 * 30 + d2 - (y1 * 365 + m1 * 30 + d1)) // 365
ans2 = y2 - y1 + 1
ans3 = y2 - y1
print(ans1)
print(ans2)
print(ans3)
