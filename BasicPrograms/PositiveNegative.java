package BasicPrograms;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter a Number ");
        int n = sc.nextInt();

        if( n > 0){
            System.out.println(" Number is Positive ");
        } else if (n < 0) {
            System.out.print(" Number is Negative ");
        } else {
            System.out.print( " Number is Zero ");
        }

        sc.close();

    }
    
}
