/*

Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same.
This must be done in place, without making a copy of the array.


Example 1

Input: nums = [0, 1, 4, 0, 5, 2]
Output: [1, 4, 5, 2, 0, 0]

Explanation:

Both the zeroes are moved to the end and the order of the other elements stay the same

Example 2

Input: nums = [0, 0, 0, 1, 3, -2]
Output: [1, 3, -2, 0, 0, 0]

Explanation:

All 3 zeroes are moved to the end and the order of the other elements stay the same

*/

package Arrays.Easy;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args){
        int[] array = {0, 1, 4, 0, 5, 2};

        System.out.println("Before : " + (Arrays.toString(array)));

        moveZero_method(array);

        System.out.println("After : " + (Arrays.toString(array)));

    }

    public static void moveZero_method(int[] array){

        int pointer1 = array.length-1;
        int pointer2 = array.length-2;

        while(pointer1 >=0 && pointer2 >= 0){
            if(array[pointer1] ==0){
                pointer1--;
            }   
            while(array[pointer2] != 0){
                pointer2--;
            }
            for(int i= pointer2; i<pointer1; i++){
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
            pointer1--;
            pointer2--;
            
        }
    }
}
