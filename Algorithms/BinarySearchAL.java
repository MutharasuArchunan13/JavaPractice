import java.util.Arrays;
public class BinarySearchAL
{
    public static void main(String arg[])
    {
        /*
         * Binary Search:
                    It's a searching algorithm to find a position of value on sorted array.
                    after complete the each step half of the  array ll'be terminated

            TimeComplexity-> O(log n)
         */

         int value;
         int array[] = new int[100];
         for(int index = 0;index < array.length;index++)// To store value as sorted form If it's not sorted, first do sorted then start binarySerach
         {
            array[index]=index;
         }
         value =40;

       //there Array have default binarySearch method so use now
       //  int position = Arrays.binarySearch(array,value);

       //we can write our own mehtod
        int position = binarySearch(array,value);
         if(position != -1)
         {
            System.out.println(value +" found at:"+position);
         }
         else
            System.out.println(value+" not found.");
    }  
    
      
     private static int  binarySearch(int[]array,long value)
     {
        int min = 0;
        int max = array.length - 1;
        while(min <= max)
        {
            int middle = min + (max - min) / 2; // To find middle is simply complicated so if min=6 and max=10 the middle is=8 so use (max-min)/2 + min;
            int finalVal = array[middle];

            if(finalVal < value)
               min = middle +1;
            else if(finalVal > value)
                max = middle - 1;
            else
              return middle;
        }
        return -1;
    }
}
