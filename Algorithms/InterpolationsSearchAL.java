public class InterpolationsSearchAL {
    public static void main(String arg[]) {
        /*
         * interpolation search -> It ll'be improvemented version of binary search used
         * for "uniformly" distributed "gusses"
         * the value might be calculated based on probe if the probe isn't result then
         * change the probe to narrow searches then try again.
         * 
         * average complexity : O(log(log n))
         * worste case : O(n) [value increase exponentially]
         */

        int array[] = { 3, 7, 9, 12, 15, 16, 20 };
        int value = 15;
        int position = interpolationSearch(array, value);
        if (position != -1)
            System.out.println("Element found at :" + position);
        else
            System.out.println("elemnt not found");
    }

    public static int interpolationSearch(int array[], int value) {
        int high = array.length - 1;// index
        int low = 0;// index
        while (low <= high && value >= array[low] && value <= array[high]) {
            /*
             * To understand the probe find equation
             * int probe = low + (high - low) * (value - array[low]) / (array[high] -
             * array[low]);
             * (high - low) -> To find probe searching area range
             * (value - arrau[low ]) -> To low index to target value availble within current
             * range
             * (array[high] - array[low]) -> endpoint of the current search range
             * (value - array[low]) / (array[high] - array[low]) ->find ratio that's have
             * tell us target value located within range.
             */
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            if (array[probe] == value) {
                return probe;
            }
            // narrow the search area
            else if (array[probe] < value)
                low = probe + 1;

            else
                high = probe - 1;
        }
        return -1;
    }
}
