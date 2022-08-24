T = int(input())
for i in range(T):
    target, word = input().split()
    target = int(target)
    print(word[:target - 1] + word[target:])