/*

Union of two sorted arrays


Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. 
The elements in the union must be in ascending order.

The union of two arrays is an array where all values are distinct and are present in either the first array, 
the second array, or both.


Example 1

Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]

Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Example 2

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
Output: [1, 3, 4, 5, 6, 7, 8, 9]

Explanation:
The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2

*/

package Arrays.Easy;

import java.util.*;

public class UnionOfSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        int num1_pointer = 0;
        int num2_pointer = 0;

        System.out.println(unionArray(nums1, nums2, num1_pointer, num2_pointer));
    }

    public static ArrayList<Integer> unionArray(int[] num1, int[] num2,
                                                 int num1_pointer, int num2_pointer) {

        ArrayList<Integer> list = new ArrayList<>();

        while (num1_pointer < num1.length && num2_pointer < num2.length) {

            if (num1[num1_pointer] <= num2[num2_pointer]) {

                if (list.isEmpty() ||
                    list.get(list.size() - 1) != num1[num1_pointer]) {

                    list.add(num1[num1_pointer]);
                }

                num1_pointer++;

            } else {

                if (list.isEmpty() ||
                    list.get(list.size() - 1) != num2[num2_pointer]) {

                    list.add(num2[num2_pointer]);
                }

                num2_pointer++;
            }
        }

        while (num1_pointer < num1.length) {

            if (list.isEmpty() ||
                list.get(list.size() - 1) != num1[num1_pointer]) {

                list.add(num1[num1_pointer]);
            }

            num1_pointer++;
        }

        while (num2_pointer < num2.length) {

            if (list.isEmpty() ||
                list.get(list.size() - 1) != num2[num2_pointer]) {

                list.add(num2[num2_pointer]);
            }

            num2_pointer++;
        }

        return list;
    }
}