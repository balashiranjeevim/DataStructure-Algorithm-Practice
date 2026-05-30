/*

Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order.
The sorting must be done in-place, without making a copy of the original array.


Example 1

Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]

Explanation:
The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Example 2

Input: nums = [0, 0, 1, 1, 1]
Output: [0, 0, 1, 1, 1]

Explanation:
The nums array in sorted order has 2 zeroes, 3 ones and zero twos

Constraints
1 <= nums.length <= 105
nums consists of 0, 1 and 2 only.

*/

package Arrays.Medium;

import java.util.Arrays;

public class SortanArrayof012s {

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 2, 0, 1, 2, 0 };

        sort_Zero_One_Twos(array);

        System.out.println(Arrays.toString(array));

    }

    public static void sort_Zero_One_Twos(int[] array) {

        int leftPointer = 0;
        int rightPointer = array.length - 1;
        int currentPointer = (array.length / 2) -1;

        while (currentPointer >= leftPointer && currentPointer <= rightPointer) {
            while (array[leftPointer] == 0) {
                leftPointer++;
            }
            while (array[rightPointer] == 2) {
                rightPointer--;
            }
            if (array[currentPointer] == 0) {
                int temp = array[currentPointer];
                array[currentPointer] = array[leftPointer];
                array[leftPointer] = temp;
            } else if (array[currentPointer] == 2) {
                int temp = array[currentPointer];
                array[currentPointer] = array[rightPointer];
                array[rightPointer] = temp;
            } else {
                currentPointer++;
            }
        }

    }

}
