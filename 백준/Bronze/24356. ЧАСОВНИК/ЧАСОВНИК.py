t1, m1, t2, m2 = map(int, input().split())

if t1 > t2 or (t1 == t2 and m1 > m2):
    t2 += 24

t = (t2 - t1) * 60 + (m2 - m1)

print(t, t // 30)