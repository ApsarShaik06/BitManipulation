public class Function{
  public static int fastExponentiation(int a, int n){
          int ans =1;
          while(n > 0){
            if((n&1) != 0){ // LSB
                ans = ans*a;
            }
            a = a*a;
            n = n>>1; // reducing n
          }
          return ans;
    }
  public static void main(String[] args){
    System.out.println(fastExponentiation(2,9));
  }
}