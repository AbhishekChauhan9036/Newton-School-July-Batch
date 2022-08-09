/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
{
    Node temp=head.next;
    Node prev=head;
    while(temp!=null){
        if(temp.data==0){
            Node curr = temp;
            temp = temp.next;
            prev.next = temp;
            curr.next=head;
            head=curr;
        }
        else{
            prev=temp;
            temp=temp.next;
        }
    }
    return head;
       // Your code here
}