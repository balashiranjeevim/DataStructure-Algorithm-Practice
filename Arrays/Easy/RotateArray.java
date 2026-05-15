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
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println("Before : " + Arrays.toString(array));

        leftRotate_Array(array, n);

        System.out.println("After : " + Arrays.toString(array));
    }

    public static void leftRotate_Array(int[] array, int operation){
        while(operation > 0){
            int pointer = 0;
            int temp = array[0];

            while(pointer < array.length-1 ){
                array[pointer] = array[pointer+1];
                pointer++;
            }
            array[pointer] = temp;
            operation--;
            
        }
    }
}
