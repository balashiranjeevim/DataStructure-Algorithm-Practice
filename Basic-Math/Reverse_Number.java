/* You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

Examples:

Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.

*/

public class Reverse_Number {
    public static int reverseNumber(int n) {
        int reversed = 0;
        int num = Math.abs(n);
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return n < 0 ? -reversed : reversed;
    }

    public static void main(String[] args) {
        int n = 122;
        int reversed = reverseNumber(n);
        System.out.println(reversed);
    }
}
