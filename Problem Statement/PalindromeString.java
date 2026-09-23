import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";

        for(int i = str.length()-1; i >= 0; i--){
            res = res + str.charAt(i);
        } if(res.equals(str)){
            System.out.print("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
