import java.util.Scanner;

public class CharacterFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]) continue;
            int count = 1;

            for(int j = i + 1; j < n; j++){
                if(visited[j]) continue;
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " " + count);
        
        }
    }
}