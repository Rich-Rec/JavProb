public class Main {
    public static void main(String[] args) {
        System.out.println(calculation(3,4));
    }
    // Part A
    static public int calculation(int firstNumber, int secondNumber)
    {
        return ((firstNumber*secondNumber/2)%7);
    }

    //Part B
    public static int[] calcSumAndCountAllNumbersDivBy_2Or_7(int maxNumber)
    {
        int [] returnValues = new int[2];
        int resultCount = 0, sumOfDivNumbers = 0;
        for (int i = 0; i <= maxNumber; i++) {
            if(i%2==0||i%7==0)
            {
                sumOfDivNumbers+=i;
                resultCount++;
            }
        }
        returnValues[0] = resultCount;
        returnValues[1] = sumOfDivNumbers;
        return returnValues;
    }
}