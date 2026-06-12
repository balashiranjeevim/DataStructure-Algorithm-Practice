/*

Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr:

[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].



The next permutation of an array of integers is the next lexicographically greater permutation of its integers.

More formally, if all the permutations of the array are sorted in lexicographical order, 
then the next permutation of that array is the permutation that follows it in the sorted order.

If such arrangement is not possible (i.e., the array is the last permutation), then rearrange it to the lowest possible order (i.e., sorted in ascending order).

You must rearrange the numbers in-place and use only constant extra memory.


Example 1

Input: nums = [1,2,3]
Output: [1,3,2]

Explanation:
The next permutation of [1,2,3] is [1,3,2].

Example 2

Input: nums = [3,2,1]
Output: [1,2,3]

Explanation:
[3,2,1] is the last permutation. So we return the first: [1,2,3].

*/

package Arrays.Medium;
import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args){
        int[] array = {2, 1, 5, 4, 3, 0, 0};

        System.out.println(Arrays.toString(findNextPermutation(array)));
    }

    public static int[] findNextPermutation(int[] array){
        int pivotIndex = -1;
        int indexOfLargerElement = -1;
        for(int i = array.length-2; i>=0; i-- ){
            if(array[i] < array[i+1]){
                pivotIndex = i;
                break;
            }
        }
        if(pivotIndex == -1){
            reverseArray(0, array.length-1, array);

            return array;
        }

        for(int j=array.length-1; j>pivotIndex; j--){
            if(array[j] > array[pivotIndex]){
                indexOfLargerElement = j;
                break;
            }
        }
        int temp = array[pivotIndex];
        array[pivotIndex] = array[indexOfLargerElement];
        array[indexOfLargerElement] = temp;

        reverseArray(pivotIndex+1, array.length-1, array);

        return array;

    }
    
    public static void reverseArray(int start, int end , int[] array){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
