def onoff(num):
    if switch_list[num] == 0:
        switch_list[num] = 1
    else:
        switch_list[num] = 0
    return


N = int(input())
switch_list = [-1] + list(map(int, input().split()))
students = int(input())
for i in range(students):
    mf, target = map(int, input().split())
    if mf == 1:
        for j in range(target, N + 1, target):
            onoff(j)
    else:
        onoff(target)
        for k in range(N // 2):
            if target + k > N or target - k < 1:
                break
            if switch_list[target + k] == switch_list[target - k]:
                onoff(target + k)
                onoff(target - k)
            else:
                break
for i in range(1, N + 1):
    print(switch_list[i], end=' ')
    if i % 20 == 0:
        print()