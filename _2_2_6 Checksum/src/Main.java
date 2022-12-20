public class Main {
    public static void main(String[] args)
    {
        final String inputString = "11111";
        System.out.println(calcChecksum(inputString));
    }
    static int calcChecksum(final String input)
    {
        int runningTotal = 0;
        for (int i = 0; i < input.length(); i++)
        {
            runningTotal += (((int) input.charAt(i)-48) * (i+1));
        }
        return runningTotal%10;
    }
}