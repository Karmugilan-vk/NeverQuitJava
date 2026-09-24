import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
    }
      for (int i = 0; i < n; i++) {
         boolean Duplicate = false;
        for(int j = 0; j < i; j++){
            if(arr[i] == arr[j]){
                Duplicate = true;
            }

        }
        if(!Duplicate){
        System.out.print(arr[i] + " ");
        }
}
    }
}
