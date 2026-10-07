/* Node Structure
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    private int maxSum;

    public int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;

        int val = findMaxPath(root);

        if (root != null && (root.left == null || root.right == null)) {
            if (maxSum == Integer.MIN_VALUE) {
                return -1;
            }
        }

        return maxSum == Integer.MIN_VALUE ? -1 : maxSum;
    }

    private int findMaxPath(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return node.data;
        }

        int leftSum = findMaxPath(node.left);
        int rightSum = findMaxPath(node.right);

        if (node.left != null && node.right != null) {
            maxSum = Math.max(maxSum, leftSum + rightSum + node.data);
            return Math.max(leftSum, rightSum) + node.data;
        }

        return (node.left != null ? leftSum : rightSum) + node.data;
    }
}