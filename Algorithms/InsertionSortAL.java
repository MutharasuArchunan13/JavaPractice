public class InsertionSortAL {
    public static void main(String arg[]) {
        /*
         * InsertionSort -> It's used to be sort list that ll'be format is insert
         * values.
         * It's start's from index 1, to assign that value as temp then to check
         * previous values less than that, until that process goes to false.
         * For each value checking process ll'be true then push that value on next index
         * untill the contion was false.
         */
        int array[] = { 3, 8, 2, 9, 1, 5 };
        int temp;

        for (int index = 1; index < array.length; index++) {
            temp = array[index];
            int j = index - 1; // for checking previous value
            while (j >= 0 && temp < array[j]) // may j goes < 0 exception occured : arrayOutOfMemoryBound
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

        for (int a : array) {
            System.out.println(a);
        }
    }
}