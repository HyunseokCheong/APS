arr = [-1] * 26
s = input()
for i in s:
    if arr[ord(i) - 97] == -1:
        arr[ord(i) - 97] = s.index(i)
print(*arr)