/* 
   .
   ..
   ...
   ....
   ..... 
print the pattern

*/

public class Pattern2 {
   public static void main(String[] args) {
      String star = "*";
      for (int i = 0; i < 5; i++) {
         System.out.println(star);
         star += "*";
      }
   }
}