import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetHashSetandLinkedHashSet 
{
    public static void main(String[]arg)
    {
        /*
         * First know about Set--> it is interface,and implemented by many classes those one of the classes are:
         *  HashSet                       and                        LinkedHashSet
         * ->it not followes order                       -> It's followed by insertion order
         * ->DS:Hashtable                                -> DS:HashTable and LinkedList 
         */
        HashSet<Integer> obj = new HashSet<>();
        obj.add(20);
        obj.add(25);
        obj.add(32);
        obj.add(100);
        obj.add(20);
        obj.add(10);
        obj.add(32);
        System.out.println(obj);

        //using LinknedHashSet
        LinkedList<Integer> obj2 = new LinkedList<>();
        obj2.add(20);
        obj2.add(10);
        obj2.add(50);
        obj2.add(22);
        obj2.add(20);
        obj2.add(10);
        System.out.println("IN_Linked_list:"+obj2);

        //Using HashLinkedSet

        System.out.println("After linkedList convert to HashLinkedList:"+new LinkedHashSet<>(obj2));




    }    
}
