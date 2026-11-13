/* Structure of a Binary Search Tree node
class Node {
  public int data;
  public Node left;
  public Node right;

  public Node(int val) {
      data = val;
      left = right = null;
  }
};
*/

class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        // code here
             ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> result = new ArrayList<>();

            // In-order traversal of both BSTs
            inorder(r1, list1);
            inorder(r2, list2);

            int i = 0, j = 0;

            // Two pointer approach to find common elements in sorted lists
            while(i < list1.size() && j < list2.size()) {
                if(list1.get(i).equals(list2.get(j))) {
                    result.add(list1.get(i));
                    i++;
                    j++;
                } else if(list1.get(i) < list2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            }

            return result;

        }
         private static void inorder(Node root, ArrayList<Integer> list) {
            if(root == null) return;
            inorder(root.left, list);
            list.add(root.data);
            inorder(root.right, list);
        }
    
}