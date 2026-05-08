
/*

1      1
12    21
123  321
12344321

Print this Pattern.
*/
import java.util.*;

public class Pattern12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int layer = input.nextInt();
        int maxCharacter = layer*2;

        int left = 2;
        int right = maxCharacter -1;

        for(int i=0; i<layer; i++){
            for(int j=1; j<=maxCharacter; j++){
                int k =  (maxCharacter+1) -j;
                if(j<left){
                    System.out.print(j);
                }
                else if(j>right){
                    System.out.print(k);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            left += 1;
            right -= 1;
        }
    }
}
