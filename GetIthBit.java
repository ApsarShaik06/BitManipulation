import java.util.Scanner;

public class BitManipulation {

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        /**
            *  Get ith Bit
               10 = 1010  and i=2
               we know that, if we do AND with 1 to any bit, will get the original Bit. 
               Here also will do AND with 1. But we have to shift the 1 to that position(required ith position).
                   1<<i
                   
                here, i=2.
                                   0001
                       1<<2 -->    0100
               Now, will to AND.
                   n&(1<<i) --> 10 -> 1010 & 0100    --> 1010
                                                         0100
                                                        -------(&)
                                                         0000  --> this means the ith Bit is "0".
            
             If we asked ith position as 1. then
               1<<i    -->     0010   
                                         n(10)->   1010
                                         &(1<<i)-> 0010
                                                  ------(&)
                                                   0010  -> here we got 2 as answer.
                                                   We all knows that, in Binary only 2 bits we have. 
                                                   So, if it is not Zero, then the remaining bit is "1" only.
                                                   So, ans is 1.
                                                   Ans also, the bit at 1st position is 1.
            */
            int n = sc.nextInt();
            int pos = sc.nextInt();
            System.out.println(getIthBit(n,pos));
    }
}
