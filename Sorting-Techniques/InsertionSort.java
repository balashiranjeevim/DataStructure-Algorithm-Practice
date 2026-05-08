/*

Implement the Insertion Sort.

*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 35, 2, 45, 50, 7, 18, 1, 20, 100, 12, 6 };

        System.out.println("Before :");
        for (int num : array)
            System.out.print(num + " ");

        array = insertionSortMethod(array);
        System.out.println("\nAfter :");
        for (int num : array)
            System.out.print(num + " ");
    }

    public static int[] insertionSortMethod(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int elementToInsert = array[i];
            int position = i - 1;

            while (position >= 0 && array[position] > elementToInsert) {
                array[position + 1] = array[position];
                position--;
            }

            array[position + 1] = elementToInsert;
        }

        return array;
    }
}
