public class MergeSortAL {
    /*
     * MergeSort-> it's follow divid and conquer method. first divide values <= 1
     * then merge bsed on the values of value.
     *
     * Time-compexity ->O(n log n)
     * space complexity --> O(n)
     */
    public static void main(String arg[]) {
        int[] array = { 7, 8, 6, 3, 2, 12, 5 };
        mergeSort(array);
        for (int values : array) {
            System.out.print(values + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1)
            return;// end baseCase testing

        int middle = length / 2;
        int[] leftArray = new int[middle];// each array divide into two part one is leftArray
        int[] rightArray = new int[length - middle];// right array

        for (int index = 0, index2 = 0; index < length; index++)// to store the value on left ans right-array
        {
            if (index < middle)
                leftArray[index] = array[index];
            else {
                rightArray[index2] = array[index];
                index2++;
            }
        }

        // then send the separated arrays because we want separate twon parts until it's
        // goes to single value(! <=1)
        mergeSort(leftArray);
        mergeSort(rightArray);
        // After complete the separation we want merge the values by value
        merge(leftArray, rightArray, array);// it's want three parameters left and right to merge then assing array
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int lIndex = 0, rIndex = 0, aIndex = 0;

        while (lIndex < leftSize && rIndex < rightSize) {
            if (leftArray[lIndex] < rightArray[rIndex]) {
                array[aIndex] = leftArray[lIndex];
                aIndex++;
                lIndex++;
            } else {
                array[aIndex] = rightArray[rIndex];
                rIndex++;
                aIndex++;
            }
        }
        while (lIndex < leftSize) {
            array[aIndex] = leftArray[lIndex];
            aIndex++;
            lIndex++;
        }
        while (rIndex < rightSize) {
            array[aIndex] = rightArray[rIndex];
            aIndex++;
            rIndex++;
        }

    }
}
