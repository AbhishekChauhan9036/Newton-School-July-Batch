/*
class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

//   static Node addOne(Node head){
// // return the head of the modified linked list
// }

/*
class Node {
    Node next;
    int data;
    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/
public static Node addOne(Node l1) {
       Node l2=new Node(1);
    Node dummyHead = new Node(0);
    Node p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.data : 0;
        int y = (q != null) ? q.data: 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new Node(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new Node(carry);
    }
    return dummyHead.next;
}