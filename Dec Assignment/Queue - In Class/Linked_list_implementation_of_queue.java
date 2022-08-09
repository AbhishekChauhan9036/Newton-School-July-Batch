class Queue
{
 private Node front, rear; 
 private int currentSize;
 
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
       
    }
}
    
 public Queue()
 {
 front = null;
 rear = null;
 currentSize = 0;
 }
 
 
 public void dequeue()
 {
     if(this.front == null) return;
     this.front = this.front.next;
     if(this.front == null) this.rear = null;
 }
 

 public void enqueue(int data)
 {
     Node n = new Node(data);
     if(this.rear == null){
         this.front = this.rear = n;
     }
     else{
         this.rear.next = n;
         this.rear = n;
     }
 }
 
 public void displayfront(){
     if(this.front == null){
         System.out.println(0);
     }
     else{
         System.out.println(this.front.val);
     }
 }
}