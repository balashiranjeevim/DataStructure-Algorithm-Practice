/*

Count the Number of digits for the Given Integer.

*/

class CountDigit {
    public static void main(String[] args) {
        int n = 100;
        int count = countDigit(n);
        System.out.println(count);
    }

    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
