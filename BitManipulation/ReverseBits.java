public class ReverseBits {
    
    public static int reverseBits(int n) {
        int rev = 0;

        for(int i=0; i<32; i++){
            int bit = n & 1;
            rev = rev <<1;
            rev = rev | bit;
            n = n >> 1;
        }
        return rev;
        
    }

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println("Reverse bit is: " +reverseBits(n));
    }
}
