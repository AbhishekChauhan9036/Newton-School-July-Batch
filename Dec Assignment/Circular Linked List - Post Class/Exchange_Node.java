/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/

static Node exchangeNodes(Node head)
    {
 
        // If list is of length 2
        if (head.next.next == head) {
            head = head.next;
            return head;
        }
        // Find pointer to previous
        // of last node
        Node p = head;
        while (p.next.next != head)
            p = p.next;
 
        // Exchange first and last
        // nodes using head and p
        p.next.next = head.next;
        head.next = p.next;
        p.next = head;
        head = head.next;
 
        return head;
    }