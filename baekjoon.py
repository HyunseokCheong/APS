import sys

input = sys.stdin.readline

day = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
day_in_month = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

m, d = map(int, input().split())

date = 0
for i in range(0, m - 1):
    date += day_in_month[i]
date = (date + d) % 7
print(day[date])
