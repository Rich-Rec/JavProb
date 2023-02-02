import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some text that will be reversed: ");
        System.out.print("Your text reversed is: " + reverseText(input.nextLine()) + "\n");
    }
    public static StringBuilder reverseText(String userText){
        StringBuilder reversed = new StringBuilder();
        for (int i = userText.length() - 1; i >= 0 ; i--) {
            reversed.append(userText.charAt(i));
        }
        return reversed;
    }
}