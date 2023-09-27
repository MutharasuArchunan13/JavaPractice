public class SelectionSortAL 
{

    public static void main(String arg[])
    {
        /*
         * SelectionSort:It is a sorting algorithm to select the element (minimum or maximum) an it takes O(n2) 
         * Time complexity like as bubbleSort but reduce number steps to swapping. 
         * the swapping ll'be reduced because that swapping work on outer loop not inner loop 
         * There are two types take small_value or take maximum_value. If you take small_value after complete the first iteration definitely got a small_value then assign that value at first.
         * Now you consider your array as two parts one is sorted and another one is non_Sorted array then find the small_value of non_sorted array then assign small value at first of non_Sorted array.
         *  
         */

        int num[] = {1,10,56,5,2,8,3,9,4};
        int temp,temp1,min;
        temp = temp1 = min =0;
        
        for(int index = 0; index < num.length;index++)
        {
            min =num[index];
            for(int index2 = index + 1;index2 < num.length;index2++)
            { 

                if(min > num[index2])
                {
                    min = num[index2];
                    temp =index2;
                }
              
            } 
            if(min != num[index])
            {
                temp1 = num[index];
                num[index] = min;
                num[temp] = temp1;      
               
            }  
            System.out.print(num[index]+",");
    }
        
    }
}
