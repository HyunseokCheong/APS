def get_num():
    ret = 0
    for val in nums:
        ret = ret * 10 + val
    return ret


def find_max(k):
    global ans
    val = get_num()
    if val in visited[k]:
        return
    visited[k].add(val)

    if k == cnt:
        ans = max(ans, val)
    else:
        for i in range(n - 1):
            for j in range(i + 1, n):
                nums[i], nums[j] = nums[j], nums[i]
                find_max(k + 1)
                nums[i], nums[j] = nums[j], nums[i]


for tc in range(int(input())):
    nums, cnt = input().split()
    n = len(nums)
    nums = list(map(int, nums))
    cnt = int(cnt)
    ans = 0
    visited = [set() for _ in range(cnt + 1)]
    find_max(0)
    print(f'#{tc + 1} {ans}')