import java.util.Scanner;

public class BitManipulation {

    public static int clearIthBit(int n, int pos){
        int bitMask = ~(1<<pos);
        return n&bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         * CLEAR ith Bit
         * 
         * We know that, if we do AND with 0, then ans will some 0 only.
         *    1&0 = 0
         *    0&0 = 0
         * 
         * so, will do AND with 0. with that, particular position. 
         * (if we do whole number with 0, then the given number becomes 0)
         *   if position is 2.  --> 1111101 like we need to get.
         *   for that, 1). left shift 1 with i positions. (00010)
         *             2). Now do NOT operation on that ~(1<<i) --> "11101"
         * 
         * n-10 ->                      1010 i=1
         *  1<<i -> 0010, now ~(1<<i) ->1101
         *  n&(~(1<<i))               -------(&) 
         *                              1000 --> ans.8      
         */

         int num = sc.nextInt();
         int i = sc.nextInt();
         System.out.println(clearIthBit(num,i));
    }
}
