'''
a 97
z 122
'''

arr = [0] * (122 - 97 + 1)
s = input()
for i in s:
    arr[ord(i) - 97] += 1
print(*arr)
