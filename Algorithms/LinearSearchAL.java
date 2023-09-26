public class LinearSearchAL 
{
    public static void main(String[]arg)
    {
        /*
         * LinearSearch: It's a algorithm to be used for search elements. It iterate through a collection one element at a time.
         * 
         * runtime complexity: O(n)
          
         disadvantage:
                    slow for large datasets;
         Advantage:
                    for search small and meadium datasets.
                    does not need to be sorted
                    useful for dataStructure that dont have random access(LinkedList)
         */

         int num[] = {3,7,2,8,9,10,1};
         int index = linearSearch(num,9);
        if(index != -1)
         System.out.println("Element position is:"+index);
        else
           System.out.println("Element not found");
    }
    private static int linearSearch(int[] array, int value) {
        for (int index= 0; index < array.length;index++)
            {
                if(array[index] == value)
                {
                    return index;
                }
            }
            return -1;
    } 


}
