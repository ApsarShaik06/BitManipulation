public class Function{
  //Check if a number is a power of 2 or not.
  /*
  If we do AND with prev. number of given number, it should have to come 0. Then the gien number is power of 2.
  4--> 100
  8--> 1000
  16-->10000

  8--> 1000
  7--> 0111
       ----(&)
       0000 (so, here 8 is power of 2).
  */
  public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
  }

  public static void main(String[] args){
      System.out.println(isPowerOfTwo(7));
  }
} 
