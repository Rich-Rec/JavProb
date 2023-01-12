import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final String romanNumber = "XVII";

        int numberResult = fromRomanNumber(romanNumber);
        System.out.println(numberResult);
    }

    static int fromRomanNumber(String input) {
        int numberFromRomanInput = 0;

        ArrayList<Integer> arrayOfConvertedValues = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                numberFromRomanInput += 10;
            }
            if (input.charAt(i) == 'V') {
                numberFromRomanInput += 5;
            }
            if (input.charAt(i) == 'I') {
                numberFromRomanInput += 1;
            }

        }
        return numberFromRomanInput;
    }
}