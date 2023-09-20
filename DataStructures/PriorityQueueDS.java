import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS
{
    public static void main(String[]arg)
    {
        /*
         * PriorityQueue : It's follow as FIFO method.First-In First-Out as like as queue but small changes in 
         * that follows the higher priority order. And we also change the priority acending to decending order to pass comparator
         *  
         */
        
       /*    Queue<String> queue = new LinkedList<>();
          //print marks
          queue.offer("90");
          queue.offer("98");
          queue.offer("89");
          queue.offer("100");
         while(!queue.isEmpty())
         {
            System.out.println(queue.poll());
         }
         o/p:   
                90
                98
                89
                100

                But we use priorityQueue  */
         Queue<Integer> priorityQueue = new PriorityQueue<>();// we can also change order to reverce  use(Comparator)-->Collections.reverseOrder()
         
         priorityQueue.offer(90);
         priorityQueue.offer(98);
         priorityQueue.offer(89);
         priorityQueue.offer(100);
        
        while(!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll());
        }
        /*
         * O/p:
         *      89
                90
                98
                100
         */
        }
}