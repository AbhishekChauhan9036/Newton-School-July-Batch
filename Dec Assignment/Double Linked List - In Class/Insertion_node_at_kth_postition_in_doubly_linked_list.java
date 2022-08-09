public static Node insertnew(Node head, int data ,int position){
//enter your code here
position=position-1;
 Node trackedHeadNode = head;
    
     Node nodeToInsert = new Node(data); 
 if(position == 0){nodeToInsert.next = head; 
 return nodeToInsert;
 }    
    
 int currPosition = 0;
while (currPosition < position -1 && head.next != null){
        head = head.next;        
        currPosition++;       
    }

  
    Node nodeAtPosition = head.next;
    head.next = nodeToInsert;
    head = head.next;
    head.next = nodeAtPosition;
        
    return trackedHeadNode;

}