/* 
   1
   22
   333
   4444
   55555
print the pattern

*/



public class Pattern4{
    public static void main(String[ ] args){
        int value = 1;
        for(int i=0; i<5; i++){
            System.out.println((i+1) * value);
            value = value * 10 +1;
        }
    }
}