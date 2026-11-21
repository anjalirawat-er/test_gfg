/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
ArrayList<Integer> zigZagTraversal(Node root) {
    int level = 1;
    ArrayList<Integer> list = new ArrayList<>();
    Queue<Node> q = new LinkedList<>();

    if (root == null) return list;

    q.offer(root);

    while (!q.isEmpty()) {
        int size = q.size();//********
        if (level % 2 == 0) {
            Stack<Integer> st = new Stack<>();
            int count = 0;
            while (count < size) {
                Node qq = q.poll();
                st.push(qq.data);

                if (qq.left != null) {
                    q.offer(qq.left);
                }
                if (qq.right != null) {
                    q.offer(qq.right);
                }

                count++;
            }

            while (!st.isEmpty()) {
                int ss = st.pop();
                list.add(ss);
            }

        } else {
            int count = 0;

            while (count < size) {
                Node qo = q.poll();
                list.add(qo.data);

                if (qo.left != null) {
                    q.offer(qo.left);
                }
                if (qo.right != null) {
                    q.offer(qo.right);
                }

                count++;
            }
        }

        level++;
    }

    return list;
    }
}