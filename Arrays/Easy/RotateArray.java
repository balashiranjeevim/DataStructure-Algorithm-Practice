/* 

Given an integer array nums, rotate the array to the left n times.

Note: There is no need to return anything, just modify the given array.


Example 1

Input: nums = [1, 2, 3, 4, 5], n = 1
Output: [2, 3, 4, 5, 1]

Explanation:
Initially, nums = [1, 2, 3, 4, 5]
Rotating once to left -> nums = [2, 3, 4, 5, 1]


Example 2

Input: nums = [1, 2, 3, 4, 5], n = 2
Output: [3, 4, 5, 1, 2]
*/

package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int[] array = { 1, 2, 3, 4, 5, 6 };

        System.out.println("Before : " + Arrays.toString(array));

        leftRotate_Array(array, k);

        System.out.println("After : " + Arrays.toString(array));
    }

    public static void leftRotate_Array(int[] array, int k) {

        // Reverse first k elements:
        reverseMethod(array, 0, k - 1);

        // Reverse remaining:
        reverseMethod(array, k, array.length - 1);

        // Reverse whole array:
        reverseMethod(array, 0, array.length - 1);

    }

    public static void reverseMethod(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

/*
 * 
 * The best approach is the Reversal Algorithm because,
 * 
 * O(n) Time
 * O(1) Extra Space
 * 
 * Instead of shifting elements one by one, we reverse parts of the array
 * 
 * 
 * Original:
 * [1,2,3,4,5,6]
 * 
 * Reverse first k elements:
 * [2,1,3,4,5,6]
 * 
 * Reverse remaining:
 * [2,1,6,5,4,3]
 * 
 * Reverse whole array:
 * [3,4,5,6,1,2]
 * 
 */