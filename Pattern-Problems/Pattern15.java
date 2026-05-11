/*

ABCDE
ABCD
ABC
AB
A

print this Pattern.

*/

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();

        for(int i=layer; i>0; i--){
            for(int j=65 ; j<65+i; j++){
                char value = (char) j;
                System.out.print(value);
            }
            System.out.println("");
        }
        
    }
    
}
