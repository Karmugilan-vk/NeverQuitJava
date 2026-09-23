import java.util.*;
public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int num = 1; num <= n; num++){
          boolean isPrime = true;

           if(num <= 1){
            isPrime = false;
           } else {
                for(int i = 2; i < num; i++){
                    if(num % i == 0){
                        isPrime = false;
                    }
                }if(isPrime){
                    System.out.print(num + " ");
                }
           }
        }
    }
}