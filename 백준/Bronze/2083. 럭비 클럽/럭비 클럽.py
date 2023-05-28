def solve(name, age, weight):
    if age > 17 or weight >= 80:
        return name + " Senior"
    else:
        return name + " Junior"


while True:
    name, age, weight = input().split()
    if name == '#':
        break
    print(solve(name, int(age), int(weight)))
