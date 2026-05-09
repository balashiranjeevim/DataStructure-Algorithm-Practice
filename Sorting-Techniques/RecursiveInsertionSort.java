/*

Implement Insertion Sort using Recursion.

*/

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] array = { 20, 550, 10, 8, 1, 7, 6, 2, 0 };

        recursiveInsertionSort(array, 1);

        for (int num : array)
            System.err.print(num + " ");
    }

    public static int[] recursiveInsertionSort(int[] array, int i) {
        if (i == array.length) {
            return array;
        }
        int position = i - 1;
        int currentElement = array[i];

        while (position >= 0 && currentElement < array[position]) {
            array[position + 1] = array[position];
            position--;
        }
        array[position + 1] = currentElement;

        return recursiveInsertionSort(array, i + 1);
    }
}
