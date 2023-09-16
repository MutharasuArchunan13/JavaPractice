import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps
{
    public static void main(String[]ar)
    {
        /*
         * Map is interface of Collection in java. this is the direct interface of collection interface
         * THE MAP contain <Keys,values>
         * implemented classes are          HashMap &                          LinkedHashMap
         *                          ->DS:Hashtable                      ->DS:HashTable & LinkedList
         *                          ->no oreder maintaitned             -> Insertion order maintained
         * 
         * the Map is folow three collection views:
         *   1:  setOfKeys ---> keySet(); // to access keys and this is follow as Set so return type is Set
         *   2:  collectionOfValues ---> values();// to access all values return types is collection because duplicate values are allowed
         *   3:  Entry -----> entry is collection of key and value pairs -- entrySet(); // return type is Set  
         */

         HashMap<Integer,String> ha = new HashMap<>();

         ha.put(12,"Arun");
         ha.put(50,"kumar");
         ha.put(52,"Arasu");
         ha.put(2,"Bhasa");
         // use duplicate values hashMap override then remove  ha.put(2,"Bhasas");
          
         // To use entrySet() Set of all keys&values
         Set<Map.Entry<Integer,String>> es = ha.entrySet();
         //use Iterator to print separatly
         Iterator<Map.Entry<Integer,String>> i =es.iterator();
         while(i.hasNext())
         {
            System.out.println(i.next());
         }
         


         // if may we want to change values(names)
         Iterator<Map.Entry<Integer,String>> newSet =es.iterator();
         while(newSet.hasNext())
         {
            //To change that entries as Entry Object then we can split the key and value then change the values (use typeCasting)
            Map.Entry<Integer,String> uniqValues = (Map.Entry<Integer,String>)newSet.next(); //typeCasting into EntryObject and got each entry as seprately type of objects
            
            if(uniqValues.getKey().equals(50))
                uniqValues.setValue("Phoenix");

         }
            System.out.println(ha);




         // //use LinkedHashMap used for if we want insertion order to used it
         LinkedHashMap<Integer,String> lh = new LinkedHashMap<>();

         lh.put(12,"ArunKumar");
         lh.put(50,"kumar");
         lh.put(52,"Arasu");
         lh.put(2,"Blhsa");
         lh.put(50,"Muthu");
         for(Integer  ks : lh.keySet())
         {
            System.out.println(ks+":"+lh.get(ks));
         }
    }
}