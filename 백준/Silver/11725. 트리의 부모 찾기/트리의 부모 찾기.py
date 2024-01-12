import sys

sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline


def recur(idx: int):
    # tree 배열에서 idx의 자식들을 순회
    for child in tree[idx]:
        # 자식의 부모를 parent 배열에 저장하고 자식의 자식이 있는지 진행
        if parent[child] == 0:
            parent[child] = idx
            recur(child)


if __name__ == "__main__":
    """
    루트가 없는 트리에서 트리의 루트를 1로 설정한 경우, 각 노드의 부모를 구해라
    """
    n = int(input())

    # tree[a] = [b, c, d]
    # a 노드의 자식들을 리스트로 저장
    # 루트가 없는 상황 -> 양방향 저장
    tree = [[] for _ in range(n + 1)]
    for _ in range(n - 1):
        a, b = map(int, input().split())
        tree[a].append(b)
        tree[b].append(a)

    # parent[a] = b
    # a 노드의 부모 b를 저장
    parent = [0 for _ in range(n + 1)]
    recur(1)

    print(*parent[2:], sep="\n")