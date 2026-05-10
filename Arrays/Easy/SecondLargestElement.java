/*

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

*/

package Arrays.Easy;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = { 10, 200, 30, 40, 50, 70, 90, 100, 80 };
        int size = arr.length - 1;
        int large_Element = -1;
        int second_large_Element = -1;

        System.out.println(getSecondLargest_Helper(arr, size, large_Element, second_large_Element));
    }

    public static int getSecondLargest_Helper(int[] arr, int size, int large_Element, int second_large_Element) {

        if (size < 0) {
            return second_large_Element;
        }

        if (arr[size] > large_Element) {
            int temp = large_Element;
            large_Element = arr[size];
            second_large_Element = temp;
        } else if (arr[size] > second_large_Element && arr[size] < large_Element) {
            second_large_Element = arr[size];
        }

        return getSecondLargest_Helper(arr, size - 1, large_Element, second_large_Element);
    }

}
