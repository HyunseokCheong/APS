data = input()

if data[0] == "\"" and data[-1] == "\"" and len(data) > 2:
    print(data[1:-1])
else:
    print("CE")