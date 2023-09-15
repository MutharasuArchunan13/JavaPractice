import java.util.HashMap;

public class CountCharacters
{
    public static void main(String []arg)
    {
        /*
         * Algorithm:
         *    First we want each charaters as separately so use toCharArray()
         *    use HashMap<key,value> so store character as key , count as value
         *    if the charaters is already there increase count+1 else add that charcter and assign initial value as 1
         */

         String passage ="what you think that will be happend";
        // Remove whitespaces
       passage = passage.replaceAll("\\s","");
         // To change string to charcters in array 
          char[] charcters =passage.toCharArray();

          // create HashMap
          HashMap<Character,Integer> characterCount = new HashMap<>(); 
          for(char ctr : charcters)
          {
            //To chech the charater already there or not
            if(characterCount.containsKey(ctr))
            {
                characterCount.put(ctr,characterCount.get(ctr)+1);
            }
            else
            {
                characterCount.put(ctr,1);
            }
          }
          System.out.println("EachCharactersCount:"+characterCount);
    }
}