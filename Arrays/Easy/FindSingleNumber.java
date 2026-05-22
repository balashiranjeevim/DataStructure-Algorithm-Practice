/*

Given an array of nums of n integers. Every integer in the array appears twice except one integer. 
Find the number that appeared once in the array.


Example 1

Input : nums = [1, 2, 2, 4, 3, 1, 4]
Output : 3

Explanation : The integer 3 has appeared only once.

Example 2

Input : nums = [5]
Output : 5

Explanation : The integer 5 has appeared only once.

Constraints

1 <= n <= 105
-3*105 <= nums[i] <= 3*105

*/

package Arrays.Easy;

import java.util.Arrays;

public class FindSingleNumber {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 2, 4, 3, 1, 4 };

        Arrays.sort(nums);

        System.out.println(findingSingleNumber_method(nums));
    }

    public static int findingSingleNumber_method(int[] array) {
        int number = 0;
        int i = 0;

        while (i < array.length) {
            if (i == 0) {
                number = array[0];
                i++;
            } else if (i == array.length - 1) {
                if (array[i] != array[i - 1]) {
                    number = array[i];
                }
                i++;
            } else if (array[i] == array[i - 1] || array[i] == array[i + 1]) {
                i++;
            } else {
                number = array[i];
                i++;
            }
        }

        return number;
    }
}
