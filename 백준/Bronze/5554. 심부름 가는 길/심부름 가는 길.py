s1 = int(input())
s2 = int(input())
s3 = int(input())
s4 = int(input())

min = (s1 + s2 + s3 + s4) // 60
sec = (s1 + s2 + s3 + s4) % 60

print(min)
print(sec)