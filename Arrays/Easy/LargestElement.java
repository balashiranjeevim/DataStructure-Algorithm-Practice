/*

Find the Largest Element in the given Array.

*/

package Arrays.Easy;

public class LargestElement {

    public static void main(String[] args) {

        int[] array = { 10, 99, 100, 1501, 6, 28, 55, 60, 40, 90, 10, 7 };

        System.out.println(largestHelper(array, array.length - 1, 0));
    }

    public static int largestHelper(int[] array, int size, int element) {
        if (size < 0) {
            return element;
        }

        if (array[size] > element) {
            element = array[size];
        }

        return largestHelper(array, size - 1, element);

    }
}
