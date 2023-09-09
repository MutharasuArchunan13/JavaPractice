import java.util.LinkedList;

public class ListLinkedList 
{
    public static void main(String[] arg)
    {
        /*
         * what is LinkedList: Its class implemented of List interface.
         * it's work : each element have have  linnked not contiguous memory allocation. but each element contain next elenebt address.
         * Followed insertion order method
         * so element(data)  insertion, remove, contian, is faster But elemnt retrival is lower 
         */

         LinkedList<Integer> obj = new LinkedList<>();
         //Here Arraylist methods also availble and extra methods also

         obj.add(20);
         obj.add(30);
         obj.add(5);
         obj.add(3);
         obj.add(20);
         System.out.println(obj);
         //extra methods

         obj.addFirst(200);
         System.out.println("after_addFirst()"+obj);
         
         obj.addLast(210);
         System.out.println("after_addLast()"+obj);

         //The offer() methods is like as add()
         obj.offerFirst(2000);
         System.out.println("after_offerFirst"+obj);

         obj.offerLast(231);
         System.out.println("after_offerLast"+obj);

         //The poll methods is like as remove()
         obj.pollFirst();
         System.out.println("after_PollFirst"+obj);

         obj.pollLast();
         System.out.println("after_pollLast"+obj);
    }    
}
