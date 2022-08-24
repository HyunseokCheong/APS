temp = []
for i in range(10):
    num = int(input())
    temp.append(num % 42)
print(len(set(temp)))