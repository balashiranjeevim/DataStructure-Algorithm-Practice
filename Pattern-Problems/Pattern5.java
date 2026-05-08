/* 
   *****
   ****
   ***
   **
   *

print the pattern

*/

class Pattern5 {
    public static void main(String[] args) {
        String stars = "*****";
        for (int i = 5; i > 0; i--) {
            System.out.println(stars.substring(0, i));
        }
    }
}