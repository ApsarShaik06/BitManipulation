import java.util.Scanner;

public class BitManipulation {

    public static int setIthBit(int n, int pos){
        return n|(1<<pos);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         * Set ith Bit
         *  n = 10 -> 1010
         *  i = 2
         * 
         * We know that, if we did OR with 1, then will get ans as 1 itself
         *       0|1 = 1
         *       1|1 = 1
         * 
         * So, we will perform OR operation here.
         *  n|(1<<i)
         */

         int num = sc.nextInt();
         int i = sc.nextInt();
         System.out.println(setIthBit(num,i));
    }
}
