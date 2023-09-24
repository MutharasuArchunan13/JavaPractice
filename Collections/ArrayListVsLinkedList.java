import java.util.*;

public class ArrayListVsLinkedList
{
    public static void main(String[]arg)
    {
        /*
         * Arralist and Linkedlist both are implemented collection interface nd to compare both classes which one is best?
         *  The ans: Both are best based on our needs 
         */
        long startTime;
        long endTime;
        long elaspedTime;

         ArrayList<Integer> arrayList = new ArrayList<>();
         LinkedList<Integer> linkedList = new LinkedList<>();

         for(int index = 0;index < 1000000;index++)
         {
            arrayList.add(index);
            linkedList.add(index);

         }

 /*         
  * ArrayList:
              To perform some operation and to use nanoTime() and check to take how do done the operations.
  */
        startTime = System.nanoTime();
        //insert data
        // arrayList.add(0, 300);// insert index:0  O/P->1685100n
        //arrayList.add(500000, 300); //insert data index:middle O?P:949000ns
        //arrayList.add(999999, 300);//insert index:last  O/P->29900ns
    //Remove data
        //arrayList.remove(0);//remove index:0  O/P->5696900ns
        //arrayList.remove(500000);//remove index:middle  O/P->804100ns
        //arrayList.remove(999999);//remove index: last  O/P->24900ns
        
    //Data retrive
        //arrayList.get(0);//retrive data index:0 O/P->20500ns
        //arrayList.get(500000);//retrive data index:middle     O/P-> 14600ns
        arrayList.get(999999);//retrive data index:last     O/P->16100ns
        endTime = System.nanoTime();
        elaspedTime = endTime - startTime;
        System.out.println("ArrayList for Data operations:"+elaspedTime+"ns");
    /*
     * LinkedList: 
     *      To perform some operation and to use nanoTime() and check to take how do done the operations.
     */
          startTime = System.nanoTime();
          // linkedList.add(0, 300);// insert index:0   O/P->49500ns
          //linkedList.add(500000, 300);// insert index:middle  O/P->10938100ns
          //linkedList.add(999999, 300);//insert index:last  O/P->39100ns
          
    //Remove data
         // linkedList.remove(0);//remove index:0  O/P->181400ns
         //linkedList.remove(500000);//remove index:middle  O/P->11798200ns
         //linkedList.remove(999999);//remove index: last  O/P->39600ns
          
    //Data retrive
          //linkedList.get(0);//retrive data index:0     O/P-> 29900ns
          //linkedList.get(500000);//retrive data index:middle     O/P-> 29626900ns
          linkedList.get(999999);//retrive data index:last     O/P->31900ns
          endTime = System.nanoTime();
          elaspedTime = endTime - startTime;
          System.out.println("LinkedList for  Data operation:"+elaspedTime+"ns");

          /*
           * Overall best perfomance goes to ArrayList.
           */
    }
}