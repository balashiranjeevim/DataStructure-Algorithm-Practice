/*

Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

*/

package Arrays.Easy;



public class SortedArrayCheck {

    public static void main(String[] args) {

        int[] array = { 10, 10, 80, 100, 150, 200 };

        System.out.println(isSorted(array));
    }

    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

}
