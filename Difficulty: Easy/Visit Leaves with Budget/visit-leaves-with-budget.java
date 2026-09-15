/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
public void Print(Node root,ArrayList<Integer> l,int mylevel){
    if(root == null){
        return;
    }
    if(root.left == null && root.right == null){
        l.add(mylevel);
    }
    Print(root.left,l,mylevel+1);
    Print(root.right,l,mylevel+1);
}
public int getCount(Node root, int bud){
  ArrayList<Integer> l = new ArrayList<>();
  Print(root,l,1);
  if(l.size() == 0){
      return 0;
  }
  Collections.sort(l);
  int ans = 0;
  int budget = bud;
  for(Integer k : l){
      if(budget < 0){
          break;
      }
      if(k <= budget){
          ans++;
          budget = budget-k;
      }else{
          break;
      }
  }
  return ans;
  
  }
}