def read_data():
    n = int(input())
    data = []
    for i in range(n):
        data.append( list(map(int, input().split())) )
    return data

data = read_data()
# print(sorted(data, key=lambda v: (v[0], v[1])))

def calc_covered_time(data):
    times = set()
    for i,j in sorted(data, key=lambda v: (v[0], v[1])):
        times.update(range(i,j))
    return len(times)

def max_covered_time(data):
    max_time = 0
    for i in range(len(data)):
        sliced = data[:i] + data[i+1:]
        covered_time = calc_covered_time(sliced)
        if covered_time > max_time:
            max_time = covered_time
    return max_time

print( max_covered_time(data) )