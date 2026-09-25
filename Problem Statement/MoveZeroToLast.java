import java.util.*;

public class MoveZeroToLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0;
        // Find non-zero values
        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        // Fill remaining positions with zero

        for (int j = pos; j < n; j++) {
            arr[j] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
