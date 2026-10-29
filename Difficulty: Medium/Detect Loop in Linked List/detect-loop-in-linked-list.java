/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        Node temp=head;

        HashMap<Node,Integer> map=new HashMap<>();

        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp=temp.next;
        }

        return false;
    }
}