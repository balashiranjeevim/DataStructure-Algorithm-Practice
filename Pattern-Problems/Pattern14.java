/*

A
AB
ABC
ABCD
ABCDE

Print the Pattern.

*/

import java.util.*;

public class Pattern14 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int layer = input.nextInt();

        for(int i=1; i<=layer; i++){
            for(int j=65; j<65+i; j++){
                char value = (char)j;
                System.out.print(value);
            }
            System.err.println("");
        }
    }
    
}
