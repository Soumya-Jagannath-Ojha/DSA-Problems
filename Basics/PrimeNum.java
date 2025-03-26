import java.util.Scanner;

public class PrimeNum {
    
    



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean check = false;
        if(num == 2){
			System.out.println(num + " is a prime number");
		}else{
            boolean isPrime = true;
            for(int i=2; i<=num-1; i++){
                if(num %i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is not a prime number");
    
            }
            
        }


        
    }
}
