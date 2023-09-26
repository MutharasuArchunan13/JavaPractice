public class BubbleSortAL
{
    public static void main(String[]arg)
    {
        /*
         * Algorthim:  Bubble Sort
         *    How it's work?
         *              This algorithm used to sorting and it follows -> take two values then check based on condition then swap it.
         *     the major issue is this algothim follow iteration that have no limit maybe that values are sorted still the iteration ll'be processed at the end.
         *   (i.e)
         *         [5,2,9,1,4,6]  to this values -> the takes first two values compare then swap based  on condition.
         *         (0,1)->(1,2)->(2,3),(3,4)->(4,5) these are values index the algorithm follows these method so it's take more time.
         *  
         */

         int amount[]={20,10,5,2000,100,500,1};
         
         // to create temp variable use during on swapping
         int temp;

         //create nested for loops because one for iteration another for swapping
         for(int index = 0; index < amount.length; index++)
         {
            for(int index2 =0;index2 < amount.length - index - 1; index2++) // index2 < amount.length - index - 1-->to understand that condition more complex but : values length is 7 but we only goes for 6 because index start fromm 0 then subtract index : after complete first iteration the highest value ll'be sorted and to place at end so not neccessary to check last values, then subtract 1 we take two values for sorting so the first iteration take last and (last + 1) next value the error ll'be occured.
            {
                //check contion for sorting
                if(amount[index2] > amount[index2 + 1])
                {
                    temp = amount[index2];
                    amount[index2] = amount[index2 + 1];
                    amount[index2 + 1] = temp;
                }
                System.out.print("iteration "+index +": [");
                for(int value : amount)
                {
                    System.out.print(value+",");
                }
                System.out.println("]");
            }
         }
    }
}