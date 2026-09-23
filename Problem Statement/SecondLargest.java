import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;

            for(int i = 1; i < n; i++){
                if(arr[i] > largest){
                    SecondLargest = largest;
                    largest = arr[i];
                } else if(arr[i] > SecondLargest && arr[i] != largest){
                    SecondLargest = arr[i];
                }
            }

            System.out.println("Second Largest " + SecondLargest);
        }
    }