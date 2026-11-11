/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Map<Integer, Node> mp = new HashMap<>();
        Node temp = head;
        int count = 1;
        while(temp!=null){
            mp.put(count, temp);
            temp = temp.next;
            count++;
        }
        if(k>mp.size()) return -1;

        int index = mp.size()-k+1;
        Node res = mp.get(index);
        return res.data;
    }
}