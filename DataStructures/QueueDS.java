import java.util.LinkedList;
import java.util.Queue;

public class QueueDS
{
 public static void main(String[]arg)
 {
    /*
     * Queue : is followed by FIFO => First-In First-Out
     * enqueue -> offer() => add element followed queue
     * dequeue -> poll() => remove the first element
     * examine -> peek() => to check particular object avilable in queue
     */

     //Important thing is Queue is interface so we can't create object so use LinkedList<E>()
     Queue<String> queues = new LinkedList<>();
     queues.offer("Amma");
     queues.offer("Appa");
     queues.offer("Anna");
     queues.offer("Anni");
     System.out.println(queues);

     // use poll() to remove first element
     queues.poll();
     System.out.println("After removing firstObject:"+queues);

     // retrive first element
    System.out.println("Retrive:"+queues.peek());

    // to use collection methods also
    System.out.println( queues.isEmpty());

    System.out.println(queues.contains("Appa"));
}    
}
