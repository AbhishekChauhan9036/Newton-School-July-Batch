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

public static Node addElement(Node head, int data) {
//enter your code here
     Node temp = head;
    if(temp == null ){
        head = new Node(data);
        return head;
    }
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = new Node(data);
    return head;
}