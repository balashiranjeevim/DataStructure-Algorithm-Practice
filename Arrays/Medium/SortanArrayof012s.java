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

    public static void sort_Zero_One_Twos(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else { // nums[mid] == 2

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }

}
