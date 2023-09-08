import java.util.ArrayList;
import java.util.List;

public class ListArrayList
{
    public static void main(String[]arg)
    {
        /*
         * List is on of subInterface of Collection(interface) -- that will be implemented by subInterface only
         * there is no direct implementation and doesn't have "JDK"
         * List is follwed by Insertion order maintained and duplication are allowed
         * that List ll'be implemented by many classes that one of the class is ArrayList and LinkedList 
         */

         /*
          * ArrayList are resizable and allowed heterogenous(distinguish) objects
          *The behind scene followed by growable or dynamic array DataStructure.
          */
          ArrayList<Integer> obj = new ArrayList<>(); /*if  we want smae type of objects use primitive dataType classes like,<Integer>*/

          obj.add(20);
          obj.add(30);
          obj.add(5);
          obj.add(3);
          obj.add(10);
          System.out.println(obj);
         /*  Note: ListArrayList.java uses unchecked or unsafe operations.
           * Note: Recompile with -Xlint:unchecked for details. 
           * compiler give the warning so use datatype to define which data we will receing.
           *    ArrayList<Integer> obj = new ArrayList<>();  instead of    ArrayList obj = new ArrayList();
           * now if you try to add other type of data's doesn't acceptable
           * */
            
           // to check particular data is  avilable 
           System.out.println( obj.contains(30));
           
           // we also remove element by index or element bot are available
           obj.remove(2);
           System.out.println(obj);

           //we can also override the element
           obj.set(2,300);
           System.out.println(obj);

           //we want part element 0 to 3
          System.out.println( obj.subList(0, 3));

          //we can also transfer whole elements one object to another object
          List<Integer> obj_2 =obj;
          System.out.println(obj_2);

          // we can also totally rremove all elements 
          obj_2.removeAll(obj_2);
            obj_2.add(20);
        
          System.out.println(obj_2);

          /*
           * ArrayList  is so comfortable to compare Array -- data retrival is very fast and 
           * DisAvantage : add/removal of an element at first/middle position needs more shift operation behind the scene
           */
    }
}