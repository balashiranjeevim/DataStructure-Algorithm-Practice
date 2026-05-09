import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();

        System.out.println(armstrongNumber(Number));
    }

    static boolean armstrongNumber(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int output = 0;

        for (int i = 0; i < charArray.length; i++) {
            int num = charArray[i] - '0';
            output += (int) Math.pow(num, 3);
        }

        return n == output ? true : false;
    }
}
