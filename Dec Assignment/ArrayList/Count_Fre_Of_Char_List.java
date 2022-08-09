// Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        // Your code here
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
       if(clist.contains(c))
        {
            System.out.println(Collections.frequency(clist, c));
        }
        else
        {
            System.out.println("Not Present");
        }
    }