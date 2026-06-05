/*

Kadane's Algorithm

Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
A subarray is a contiguous non-empty sequence of elements within an array.


Example 1
Input: nums = [2, 3, 5, -2, 7, -4]
Output: 15

Explanation:
The subarray from index 0 to index 4 has the largest sum = 15

Example 2
Input: nums = [-2, -3, -7, -2, -10, -4]
Output: -2

Explanation:=
The element on index 0 or index 3 make up the largest sum when taken as a subarray

*/

package Arrays.Medium;

public class KadanesAlgorithm {

    public static void main(String[] args){
         int[] nums = {-2, -3, -7, -2, -10, -4};

         System.out.println(KadanesAlgorithm_method(nums));
    }
    
    public static int KadanesAlgorithm_method(int[] array){
        int currentSum = array[0];
        int maxSum = array[0];

        for(int num : array){
            currentSum = Math.max(num, currentSum+num);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    
}
