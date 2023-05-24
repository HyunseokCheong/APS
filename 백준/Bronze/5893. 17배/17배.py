binNum = input()

# 2진수 -> 10진수
decNum = int(binNum, 2)

# 10진수 * 17
decNum *= 17

# 10진수 -> 2진수
# binNum = bin(decNum)
binNum = format(decNum, 'b')

print(binNum)