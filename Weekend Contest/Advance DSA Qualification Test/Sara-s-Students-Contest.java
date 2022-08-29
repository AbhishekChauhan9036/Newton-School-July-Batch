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
public static int maxChocolates(Node head) {
//Enter your code here
        Node slow =head;
        Node fast =head;
        int max = Integer.MIN_VALUE;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseLL(slow);
        fast = head;
        // System.out.println(slow.val);
        // System.out.println(fast.val);
        while(slow!=null)
        {
            max = Math.max((slow.val+fast.val),max);
            slow = slow.next;
            fast = fast.next;
        }

        return max;
        
}

   public static Node reverseLL(Node head)
    {
        Node prev = null;
        Node cur = head;
        while(cur!=null)
        {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        head = prev;
        return head;
    }