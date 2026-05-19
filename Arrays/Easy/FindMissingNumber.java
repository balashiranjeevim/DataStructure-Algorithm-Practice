/*

Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.


Example 1

Input: nums = [0, 2, 3, 1, 4]
Output: 5

Explanation:
nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

Example 2

Input: nums = [0, 1, 2, 4, 5, 6]
Output: 3

Explanation:
nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]

Constraints

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

*/

package Arrays.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] array = { 0, 1, 2, 3, 5, 4 };
        int n = array.length;

        System.out.println(find_missing_number(n, array));
    }

    public static int find_missing_number(int n, int[] array) {

        //// we create a value of sum of n real number using the formula
        int expectedValue = n * (n + 1) / 2;

        // Then we are subtracting the value with array value, hence we find the missing
        // number.
        for (int i = 0; i < array.length; i++) {
            expectedValue -= array[i];
        }

        return expectedValue;
    }

}
