while True:
    s = input()
    if s == '#':
        break
    arr = ['a', 'e', 'i', 'o', 'u']
    ans = 0
    for i in s:
        if i.lower() in arr:
            ans += 1
    print(ans)
