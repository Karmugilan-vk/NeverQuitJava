package BasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int originalNum = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum = sum + (digit * digit * digit);

            n = n / 10;
        }

        if (sum == originalNum) {

            System.out.println(originalNum + " is an Armstrong Number");

        } else {

            System.out.println(originalNum + " is Not an Armstrong Number");
        }

        sc.close();
    }
}