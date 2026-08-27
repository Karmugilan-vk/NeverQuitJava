package BasicPrograms;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         System.out.print(" Print First Number ");
        int a = sc.nextInt();

        System.out.print(" Print Second Number ");
        int b = sc.nextInt();

        int sum = a + b;

       
        
        System.out.println("sum = " + sum);

    }
}
