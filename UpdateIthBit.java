import java.util.Scanner;

public class BitManipulation {

    public static int updateIthBit(int n, int i, int newBit){
        int clearBit = n&(~(1<<i));
        n = clearBit | (newBit<<i);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
         * UPDATE ith bit (by 1)
         * n-> 10 -> 1010   i->2 --> ans will be 1110
         * 
         * For any update activity, 
         *  1). Clear the existing bit at that position.
         *  2). Set bit at that position.
         * 
         * 1). clear bit. 
         *    Do AND with 0 at position. (remaining positions needs to be do AND with 1, as we need Original bits there.)
         *    ~(1<<i)    
         *    i=2.  ~(00100) --> 11011
         *   Now, do AND --> n&(~(1<<i)) --> 1010 & 1011 --> 1010 (ANS)
         * Clear operation done.
         * 
         * 2). Set bit.
         *   Do OR with 1 at that position, and for remaning( do OR with 0, as we need Original bits there.)
         * 
         *   n|(1<<i) --> 1010 | 0100 --> 1110. 
         *   ANS is 1110 --> 14.
         *    
         */

         int num = sc.nextInt();
         int i = sc.nextInt();
         int newBit = sc.nextInt();
         System.out.println(updateIthBit(num,i,newBit));
    }
}
