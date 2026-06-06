/*

Kadane's Algorithm - Print the Sub Array.

Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.


Example 1
Input: nums = [2, 3, 5, -2, 7, -4]
Output: [2, 3, 5, -2, 7]

Explanation:
The subarray from index 0 to index 4 has the largest sum = 15

Example 2
Input: nums = [-2, -3, -7, -2, -10, -4]
Output: [-2]

Explanation:=
The element on index 0 or index 3 make up the largest sum when taken as a subarray

*/

package Arrays.Medium;

import java.util.*;

public class KadanesAlgorithmExtended {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4 };

        System.out.println(KadanesAlgorithmExtended_method(nums));
    }

    public static String KadanesAlgorithmExtended_method(int[] array) {

        int currentSum = array[0];
        int maxSum = array[0];
        int start = 0;
        int end = 0;
        int tempStart =0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > currentSum + array[i]) {
                tempStart = i;
            }
            currentSum = Math.max((array[i]), currentSum + array[i]);

            if (maxSum < currentSum) {
                start = tempStart;
                end = i;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        int[] subArray = Arrays.copyOfRange(array, start, end + 1);

        return Arrays.toString(subArray);
    }
}
