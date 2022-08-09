/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/


static Node deleteNode(Node head_ref, Node del)
{
    // base case
    if (head_ref == null || del == null)
        return head_ref;
 

    if (head_ref == del)
        head_ref = del.next;
 

    if (del.next != null)
        del.next.prev = del.prev;
 
    if (del.prev != null)
        del.prev.next = del.next;
    return head_ref;
}

static Node deleteDuplicates(Node head_ref)
{

    if ((head_ref) == null ||
        (head_ref).next == null)
        return head_ref;;
 
    Node ptr1, ptr2;
 
    // pick elements one by one
    for (ptr1 = head_ref;
         ptr1 != null; ptr1 = ptr1.next)
    {
        ptr2 = ptr1.next;

        while (ptr2 != null)
        {
 

            if (ptr1.val == ptr2.val)
            {
 

                Node next = ptr2.next;
 

                head_ref = deleteNode(head_ref, ptr2);
 

                ptr2 = next;
            }
 

            else
                ptr2 = ptr2.next;
        }
    }
    return head_ref;
}