now_time = list(map(int, input().split(':')))
start_time = list(map(int, input().split(':')))
answer = start_time[0] * 3600 - now_time[0] * 3600 + start_time[1] * 60 - now_time[1] * 60 + start_time[2] - now_time[2]
if answer < 0:
    answer += 86400
h = answer // 3600
m = (answer % 3600) // 60
s = answer % 60
print(f'{h:02d}:{m:02d}:{s:02d}')