import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int numberLimit = 50000;
        List<Integer> listOfPerfectNums = calcPerfectNumbers(numberLimit);
        System.out.println("Hello world!");
        System.out.println(listOfPerfectNums);
    }

    static List<Integer> calcPerfectNumbers(final int input)
    {
        List<Integer> evenNumbersFromInput = new ArrayList<>();
        List<Integer> sumsFromAddedNumbers = new ArrayList<>();
        List<Integer> perfectNumbers = new ArrayList<>();
        int sumOfNumbers = 0;
        int countForSumsList = 0;
        int countForPerfectList = 0;

        //All perfect numbers are even - get all even numbers in range
        for (int i = 1; i <= input; i++) {
            if(i%2==0){
                evenNumbersFromInput.add(i);
            }
        }
        //Add all numbers in range to iterate and compare to all even numbers in range
        //sumFromAdded - numbers is every number in range that user can get by adding all numbers up to input
        for (int i = 1; i < input; i++) {
            sumOfNumbers += i;
            for (int j = 0; j < evenNumbersFromInput.size(); j++) {
                if(evenNumbersFromInput.get(j) == sumOfNumbers)
                {
                    sumsFromAddedNumbers.add(countForSumsList, evenNumbersFromInput.get(j));
                    countForSumsList++;
                }
            }
        }
        //Iterate through sumFromAddedNumbers - Inside nested loop add all divisors and compare to sumFromAddedNumbers.get(i)
        for (int i = 0; i < sumsFromAddedNumbers.size(); i++) {
            int numberFromList = sumsFromAddedNumbers.get(i);
            int sumOfDivisors = 0;
            //Set int = sumFromNumbers.get(i)
            for (int j = 1; j < numberFromList; j++)
            {
                if(numberFromList%j == 0)
                {
                    sumOfDivisors += j;
                }
            }
            if(sumOfDivisors == numberFromList)
            {
                perfectNumbers.add(countForPerfectList,numberFromList);
                countForPerfectList++;
            }
        }

        return perfectNumbers;
    }
}