/*
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4

*/

public class GcdTwoNumbers {

    public int gcd(int a, int b) {
        int c = 0;
        while(b!=0){
            
            c = a%b;
            a = b;
            b = c;
        }
        
        return a;
    }

    public static void main(String[] args) {
        GcdTwoNumbers obj = new GcdTwoNumbers();

        int num1 = 48;
        int num2 = 18;
        System.out.println(obj.gcd(num1, num2)); 
    }
}