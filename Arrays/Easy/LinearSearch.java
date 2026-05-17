/*

Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target 
appears in the array. If the target is not found in the array, return -1


Example 1

Input: nums = [2, 3, 4, 5, 3], target = 3
Output: 1

Explanation:
The first occurence of 3 in nums is at index 1

Example 2

Input: nums = [2, -4, 4, 0, 10], target = 6
Output: -1

Explanation:
The value 6 does not occur in the array, hence output is -1

*/


package Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int target = input.nextInt();
        int[] array = {35, 2, 2, 45, 50, 7, 18, 1, 20, 100, 12, 50,  6};

        System.out.println(find_Target_Index(array, target));
    }

    public static int find_Target_Index(int[] array, int target){
        int output = -1;
        for(int i=0; i<array.length; i++){
            if(array[i] == target){
                output = i;
                break;
            }
        }
        return output;
    }
    
}
