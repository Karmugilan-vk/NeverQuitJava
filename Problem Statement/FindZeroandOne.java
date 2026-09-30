import java.util.*;
public class FindZeroandOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        if(n % 2 == 0)
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int zero = 0;
        int one = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zero++;
            } else {
                one++;
            }
        }

            if(zero == one){
                System.out.println(n);
            } else {
                System.out.println("0");
            }
    }
}
