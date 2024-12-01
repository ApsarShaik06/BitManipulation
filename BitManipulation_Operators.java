public class BitManipulation {
    
    public static void main(String[] args) {
          
        int a = 5&3;
        /** 5 AND 3
         * 5 = 1 0 1
         * 3 = 0 1 1
         * ---------(&)
         *     0 0 1 --> 1
         */

         System.out.println(a);

         int b = 10 | 4;
         /** 10 OR 4
          * 10 = 1 0 1 0
          *  4 = 0 1 0 0
          * ------------(|)
          *      1 1 1 0--> 14
          */
          System.out.println(b);

          int c = 6 ^ 3;
          /** 6 XOR 3
           * 6 = 1 1 0  
           * 3 = 0 1 1
           * ---------(^)    1^1 -> 0 and 0^0 --> 0 .. If we have differnet like 0^1 or 1^0 --> 1
           *     1 0 1 --> 5  
           */
          System.out.println(c);

          int d = ~-11;
          /* not of (-11)
           * ~ means Not--> if we have 0, then it will change as 1 visevirsa
           *    4 = 1 0 0
           *  ~4 ->0 1 1 --> 3 not ended here. 4 means 00....0000...0000100
           *  then if we do ~ if 4 -->                 11.....1111.111..011 
           *  if t MSB is 1 then that number is Negative number.
           * 
           *      1 0 0
           * (+1)     1
           * -----------
           *      1 0 1 ->  5 in before step -> we got negative. So, the ans is -5.
           * 
           * Step 1-> do not and take the sign (+or-)
           * Step 2-> If we got the sign as + from 1st step then : then do substract 1 to the given number
           *          If we got the sign as - from 1st step then : then do addition 1 to the given number  
           * Step 3-> return the sign and step2 result
           */
          System.out.println(d);

          int e = 5<<2;
          /** 5 left shift 2
           * 5 =  1 0 1
           *  <<2 means move to left with 2 bits and place zero at shifted places
           *  1 0 1 _ _    
           *   in the above the given number is shifted to 2 places to left side
           *  the result is  
           *            1 0 1 0 0  --> (1)2^4 + (0)2^3 + (1)2^2 + (0)2^1 + (0)2^0 --> 16+0+4+0+0 = 20s
           */
          System.out.println(e);

          int f = 5>>2;
          /** 5 right shift 2
           * 5 =  1 0 1
           *  >>2 means move to right with 2 bits and place zero at shifted places
           *      0 0 1 0 1  --> after went to right side there no valid place to place it,
           *            - -       so the shifted bits will remove entirely.    
           *   in the above the given number is shifted to 2 places to right side  
           *  the result is  
           *           1   --> (1)2^0 --> 16+0+4+0+0 = 20s   1
           */
          System.out.println(f);
    }
}

// Output:-
// 1
// 14
// 5
// 10
// 20
// 1
