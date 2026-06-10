/*


Rearrange array elements by sign

Given an integer array nums of even length consisting of an equal number of positive and negative integers.
Return the answer array in such a way that the given conditions are met:

Every consecutive pair of integers have opposite signs.

For all integers with the same sign, the order in which they were present in nums is preserved.

The rearranged array begins with a positive integer.

Example 1

Input : nums = [2, 4, 5, -1, -3, -4]
Output : [2, -1, 4, -3, 5, -4]

Explanation:
The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions

Example 2

Input : nums = [1, -1, -3, -4, 2, 3]
Output : [1, -1, 2, -3, 3, -4]

Explanation:
The positive number 1, 2, 3 maintain their relative positions and -1, -3, -4 maintain their relative positions

*/

package Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[]  array = {2, 4, 5, -1, -3, -4};

        System.out.println(Arrays.toString(rearrangeArray(array)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int pointer1 = 0;
        int pointer2 = size/2 + 1;
        int i = 0;

        int[] resultArray = new int[size];

        while(pointer1<(size/2+1) && pointer2 < nums.length){

            resultArray[i] = nums[pointer1];
            i++;
            pointer1++;
            resultArray[i] = nums[pointer2];
            i++;
            pointer2++; 
        }

        return resultArray;
    }
    
}
