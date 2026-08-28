package BasicPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(" Number is Even ");
        } else {
            System.out.println(" Number is odd ");
        }
        sc.close();
    }
}
