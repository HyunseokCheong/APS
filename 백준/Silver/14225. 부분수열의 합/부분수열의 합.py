N = int(input())
arr = list(map(int, input().split()))
ans = []


def bt(val, idx):
    if idx == N:
        return 0
    val += arr[idx]
    ans.append(val)
    bt(val, idx + 1)
    val -= arr[idx]
    bt(val, idx + 1)


bt(0, 0)
ans_set = set(ans)
for i in range(1, 2000000):
    if i not in ans_set:
        print(i)
        break
