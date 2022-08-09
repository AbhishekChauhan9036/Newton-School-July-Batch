/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} 
*/

static Node prev = null;
  

   static void BToDLL(Node root)
    {
    
        if (root == null)
            return;
  

        BToDLL(root.left);
  
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
  
    
        BToDLL(root.right);
    }