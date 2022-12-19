import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
//        int n = 10;
//        String inputToText = String.valueOf(n);
//        System.out.println(inputToText.charAt(0));
        final int userInput = 43;
       System.out.println(numberAsText(userInput));

    }

    static String numberAsText(final int n)
    {
        String value = "";
        int remainingValue = n;

        while(remainingValue > 0)
        {
            String remainderAsText = digitAsText(remainingValue%10);
            value = remainderAsText + " " + value;

            remainingValue /= 10;
        }
        return value.trim();
    }

    static Map<Integer, String> valueToTextMap = Map.of(0, "ZERO", 1, "ONE", 2, "TWO",3, "THREE", 4, "FOUR",5, "FIVE", 6, "SIX", 7, "SEVEN", 8, "EIGHT", 9, "NINE");

    static String digitAsText(final int n)
    {
        return valueToTextMap.get(n%10);
    }
}