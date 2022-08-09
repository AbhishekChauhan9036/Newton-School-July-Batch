/*

 class Node 
{  
    int data;  
    Node next;  
    Node(int x)  
    {  
        data = x;  
        next = null;  
    }  
};
*/
static Node deleteK(Node head, int k){
//Enter your code here
printCircularList(head);
int c=0;
Node p=null;
Node s=head;
while(s!=s.next)
{
    if(c==k)
    {
        p.next=s.next;
        c=0;
        if(s==head)
        head=s.next;
        printCircularList(head);
    }
    p=s;
    c++;
    s=s.next;
}
return head;
} 

static void printCircularList(Node head)
{
   // System.out.print(head.data);
    Node s=head;
    int k=0;
    while(s!=head || k==0)
    { 
        k++;
        System.out.print(s.data+"->");
        s=s.next;
    }
    System.out.print(s.data);
    System.out.println();
}