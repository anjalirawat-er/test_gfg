/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    private int maxLen = 0;

    public int longestConsecutive(Node root) {
        if (root == null) {
            return -1;
        }

        maxLen = 0;
        dfs(root, root.data, 0);

        return maxLen >= 2 ? maxLen : -1;
    }

    private void dfs(Node node, int expected, int currentLen) {
        if (node == null) {
            return;
        }

        if (node.data == expected) {
            currentLen++;
        } else {
            currentLen = 1;
        }

        maxLen = Math.max(maxLen, currentLen);

        dfs(node.left, node.data + 1, currentLen);
        dfs(node.right, node.data + 1, currentLen);
    }
}