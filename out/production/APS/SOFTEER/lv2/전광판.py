light = {
    "0": "1110111", "1": "0010010", "2": "1011101", "3": "1011011", "4": "0111010", "5": "1101011", "6": "1101111",
    "7": "1110010", "8": "1111111", "9": "1111011", " ": "0000000"
}

t = int(input())

while t:
    t -= 1
    a, b = input().split()
    a = (5 - len(a)) * " " + a
    b = (5 - len(b)) * " " + b

    answer = 0
    for i in range(5):
        for j in range(7):
            if light[a[i]][j] != light[b[i]][j]:
                answer += 1
    print(answer)
