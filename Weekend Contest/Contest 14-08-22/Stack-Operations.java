public static void push(Stack<Integer> st, int x)
    {
        // your code here
        st.push(x);
    }

    // Function to pop element from stack
    public static void pop(Stack<Integer> st)
    {
        //your code here
        if(!st.empty())
        st.pop();
    }

    public static void top(Stack<Integer> st)
    {
        // your code here
        if(!st.empty()){
            System.out.println(st.peek());
        }
        else{
            System.out.println(0);
        }
    }