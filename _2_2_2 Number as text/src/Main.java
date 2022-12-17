public class Main {
    public static void main(String[] args) {
//        int n = 10;
//        String inputToText = String.valueOf(n);
//        System.out.println(inputToText.charAt(0));
        String numberTest = numberAsText(87);
        System.out.println(numberTest);

    }

    static public String numberAsText(final int n)
        {
            final int remainder = n % 10;
            String inputToText = String.valueOf(n);
            String valueAsText = "";
            if (remainder == 0)
                valueAsText = "ZERO";
            if (remainder == 1)
                valueAsText = "ONE";
            if (remainder == 2)
                valueAsText = "TWO";
            if (remainder == 3)
                valueAsText = "THREE";
            if (remainder == 4)
                valueAsText = "FOUR";
            if (remainder == 5)
                valueAsText = "FIVE";
            if (remainder == 6)
                valueAsText = "SIX";
            if (remainder == 7)
                valueAsText = "SEVEN";
            if (remainder == 8)
                valueAsText = "EIGHT";
            if (remainder == 9)
                valueAsText = "NINE";

            return valueAsText;
    }
}