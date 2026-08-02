/*

Largest Odd Number in a String

Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.



The number returned should not have leading zero's. But the given input string may have leading zero. (If no odd number is found, then return empty string.)


Example 1

Input : s = "5347"
Output : "5347"

Explanation :
The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.

Example 2

Input : s = "0214638"
Output : "21463"

Explanation :
The different odd numbers that can be formed by the given string are 
--> 1, 3, 21, 63, 463, 1463, 21463.
We cannot include 021463 as the number contains leading zero.\
So largest odd number in given string is 21463.

*/


public class LargestOddNumberInAString {
    public static void main(String[] args) {

        String num = "0024681";

        char[] array = num.toCharArray();

        int start = 0;
        int end = -1;

        // Find first non-zero digit
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '0') {
                start = i;
                break;
            }
        }

        // Find last odd digit
        for (int i = array.length - 1; i >= 0; i--) {
            if ((array[i] - '0') % 2 != 0) {
                end = i;
                break;
            }
        }

        if (end == -1) {
            System.out.println("");
            return;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
        }
    }
}