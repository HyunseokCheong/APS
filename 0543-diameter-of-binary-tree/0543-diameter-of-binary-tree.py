class Solution:
    def __init__(self):
        self.result = None

    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        self.result = 0
        self.dfs(root)
        return self.result

    def dfs(self, node):
        if node is None:
            return 0

        left_height = self.dfs(node.left)
        right_height = self.dfs(node.right)
        self.result = max(self.result, left_height + right_height)

        return max(left_height, right_height) + 1