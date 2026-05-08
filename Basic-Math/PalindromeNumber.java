/* Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

*/

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        boolean isNegative = x < 0;
        int value = Math.abs(x);
        char[] characterArray = String.valueOf(value).toCharArray();
        String word = "";

        if (isNegative) {
            return false;
        } else {
            for (int i = characterArray.length - 1; i >= 0; i--) {
                word += characterArray[i];
            }

            try {
                return x == Integer.parseInt(word);
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();

        int num = 121;
        System.out.println(obj.isPalindrome(num)); // true

    }
}