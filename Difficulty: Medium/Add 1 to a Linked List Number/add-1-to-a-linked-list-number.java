/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        head = reverse(head);
        Node curr = head;
        int carry = 1;
        while (curr != null && carry == 1) {
            int sum   = curr.data + carry;
            curr.data = sum % 10;
            carry= sum / 10;
            curr= curr.next;
        }
        head = reverse(head);
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}