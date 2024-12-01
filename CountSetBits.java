public class Function {

    public static int countSetBits(int n){
        int count =0;
        while(n != 0){
            if((n&1) == 1){ // here we are checking the LSB, if right most bit(0th bit) is 1, then only will increase count.
                count++;
            }
            n = n>>1; // reducing our number, by doing right shift by 1.
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
