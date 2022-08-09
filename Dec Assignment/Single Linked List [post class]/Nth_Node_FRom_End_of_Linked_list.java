/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	  Node first = head;
    Node second = head;
    for(int i=0;i<n-1;i++){
        second = second.next;
        if(second == null)
            return -1;
    }
    
    while(second.next != null){
        first = first.next;
        second = second.next;
    }
    
   
    return first.data;
    }