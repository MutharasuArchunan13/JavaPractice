import java.util.*;
public class LinkedListDS
{
    public static void main(String[]arg)
    {

        /*
         * Linkedlist -> it is implemented class of List interface and it's contains two nodes [data + address]
         * Those nodes not follow the contiguous memory location
         * nodes are linked using pointers
         * 
         *                  singly LinkedList
         *   Node                    Node                   Node
         * [data + address] ->   [data + address]  ->  [data + address]
         * 
         *                  doubly LinkedList
         * Node                                     Node                     Node
         * [address + data + address] <-> [address + data + address] <-> [address + data + address]
         * 
         * // the first address contain previous data address & second address contain next data address
         * 
         *  advantage:
         *      ->  insertion and deletion is easy 
         *      ->  dynamic datastructure
         *      ->  no or low memory waste
         * 
         * disadvantage:
         *       -> data retrive consuming more time
         *       -> no random access of index[no index[i]] 
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(20);//Insert the element front of list
        linkedList.push(70);
        linkedList.push(60);
        linkedList.push(50);
        linkedList.push(30);
        linkedList.pop();//remove first element also use -> poll()
        linkedList.add(3, 99);// add element base on index
      System.out.println(linkedList);

     
    }
}