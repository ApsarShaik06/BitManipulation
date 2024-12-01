import java.util.Scanner;
public class BitManipulation {
    public static boolean isEven(int n){
        return (n&1) == 0;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       // check given number is even or odd
          /**
           *  0 = 00
           *  1 = 01
           *  2 = 10
           *  3 = 11
           *  4 = 100
           *  5 = 101
           *  6 = 110
           *  7 = 111
           *  8 = 1000
           *  9 = 1001
           * 10 = 1010
           * 
           * If we observe above, we can see a pattren , 
           * If number is EVEN the "LSB is 0" and 
           * if the number is ODD then the "LSB is 1"
           * 
           * Do AND with 1
           *       2 =  10
           * &1 -->      1
           *         ------
           *            00 -- if ans is 0 then the given number is Even.
           *       3 = 11
           * &1 -->     1
           *       -------
           *           01  --> If ans is 1, then the given number is ODD.
           */
      
          int n = sc.nextInt();
           if(isEven(n)){
               System.out.println("Given number "+n+" is Even number.");
           } else {
               System.out.println("Given number "+n+" is Odd number.");
           }
    }
}
