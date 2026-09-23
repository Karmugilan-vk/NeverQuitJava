import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         
        boolean isPrime = true;

        if(n < 0){
            isPrime = true;
        } for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
            }
        } if(isPrime){
            System.out.println("It is a Prime");
        } else {
            System.out.println("Not a Prime");
        }
    }
}
