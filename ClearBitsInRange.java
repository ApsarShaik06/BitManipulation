public class ClearRangeBits {
    public static void main(String[] args) {
        int n = 10;
        int i=1;
        int j=2;
        /*
         * Clear range of bits
         * 10-> 1010 i=1, j=2  ans needs to come 1000 -> 8
         * if we want to clear a bit, do AND with 0. Here, we need to clear bits in range.
         * so, we need to put 0s at thats bits position and need to maintain 1s at rest of positions.
         * 1010 (given n)
         * 1001 (Our number i=1 to j=2), to get this, we need to divide this number into 2 halfs.
         *   1). 1000    (suppose it's "a")
         *   2). 0001     (suppose it's "b")
         *   --------(|)OR (a|b)
         *       1001 --> you will get the desired bits/number.
         * FIND "a"->
         *    (~0)<<j+1 
         * FIND "b"->
         *    we have to know this concept here.
         *    01 = (1)base10 = (2^1) -1
         *   011 = (3)base10 = (2^2) -1
         *  0111 = (7)base10 = (2^3) -1
         * 01111 = (15)base10 = (2^4) -1
         *   
         * from above (2^b) -1 is formula 
         *   2^b = 1<<b 
         *   (2^b)-1 = (1<<b)-1
         * 
         * b = (1<<b) -1
         * 
         * example:- i=1    
         *         1<<1 -> 10 
         *        now (-1)  1
         *             ---------(-)
         *                 01
         * 
         * =============
         * 
         * after that a|b -> 1000|0001 = 1001
         * 
         * then 1010 & 1001 --> 1000 (8).
         */
        
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        System.out.println(n&(a|b));
    } 
}
