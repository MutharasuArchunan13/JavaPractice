import java.util.Stack;


public class StackDS
{
    public static void main(String[]arg)
    {
        /*
         *Stack : is followed by LIFO=>Last_In First-Out
         *
         * To store the object as vertical tower method 
         * method:
         * -> push()  => used to add the object top of the Stack.
         * -> pop()   => used to remove last object top of the Stack.
         * -> peek()  => used to retrive the object top of the Stack.
         * -> empty() => used to check the Stack is empty or not.
         * -> search()=> used to check particular object available on Stack.
         */
        Stack<String> st = new Stack<>();

        st.push("Fasel");
        st.push("Arun");
        st.push("silver");
        st.push("Ashly");
        st.push("Arasu");
        System.out.println(st);

    //after pop()
    st.pop();
    System.out.println("After pop():"+st);

    // peek() to retrive without removing
    System.out.println( "Use peek():"+st.peek());

    //empty()
    System.out.println("Check empty or not:"+st.empty());

    // search() -> searching particular object ---may object not found return -ve values
    System.out.println("Object searching:"+st.search("Ashly"));


    }
}