def recur(depth, arr):
    global min_count, max_song
    if depth == guitar:
        cur_song = 0
        visited = [0] * song
        for i in range(len(arr)):
            for j in range(song):
                if arr[i][j] == 'Y' and visited[j] == 0:
                    visited[j] = 1
                    cur_song += 1

        if cur_song > max_song:
            max_song = cur_song
            min_count = len(arr)
        elif cur_song == max_song:
            min_count = min(min_count, len(arr))
        return

    arr.append(guitar_list[depth])
    recur(depth + 1, arr)
    arr.pop()
    recur(depth + 1, arr)


guitar, song = map(int, input().split())
guitar_list = []
for _ in range(guitar):
    name, possible = input().split()
    guitar_list.append(possible)

min_count = 10 ** 10
max_song = -10 ** 10
cur = []
recur(0, cur)
min_count = -1 if min_count == 0 else min_count
print(min_count)
