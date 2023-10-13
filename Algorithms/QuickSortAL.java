/*
 * QuickSort -> To work with quicksort before must know about,
 * Divide and conquer --> divide the big problem to smaller problems then find the solution  and conquer
 * pivot -->  middle of the problem point 
 * recursion --> function call itself
 * knowledge about tree
 * 
 *      find the pivot the you got sorted collections of values but not truely sorted.
 * It's based on pivot. left-side of the pivot values less than pivot value and right-side of pivot values greater than of pivot
 *  then divide two part of the array expect pivot, left-side values one part and right-side values one part.
 * then find pivot of both parts, until low less than high
    
     time-complexity --> O(n log(n))
     worst-case --> O(n^2)// already sorted array
    

 */

public class QuickSortAL {
    public static void main(String arg[]) {
        int array[] = { 113, 2, 9, 34, 23, 1, 13, 9 };
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
        for (int val : array) {
            System.out.println(val);
        }
    }

    private static void quickSort(int array[], int low, int high) {
        if (low < high) // check high < low then allow
        {
            int pivot = partision(array, low, high);// find pivot
            // after finding pivot we want separate two part one part is left-side of povot
            quickSort(array, low, pivot - 1);

            // after finding pivot we want separate two part another part is right-side of
            // pivot
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partision(int array[], int low, int high) {
        int i = low - 1;
        int temp = 0;
        for (int j = low; j < high; j++) {
            if (array[j] < array[high]) {
                i++;
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
        temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;
    }
}

public class MergeSortAL {

    public static void main(String args[]) {
        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity = O(n)

        int[] array = { 8, 2, 5, 3, 4, 7, 6, 1 };

        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <= 1)
            return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}