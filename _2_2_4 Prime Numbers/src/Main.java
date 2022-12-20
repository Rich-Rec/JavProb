import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        final int userInput = 25;
        System.out.println(calcPrimesUpTo(userInput));
    }
    static List<Integer> calcPrimesUpTo(final int input)
    {
        List<Integer> listOfNumbers = new ArrayList<>(); //Populate with all values in range
        List<Integer> listOfPrimes = new ArrayList<>();
        int divisorCounter = 0; //When this counter is > 2 the number is not a prime number
        int listOfPrimesCounter = 0;
        int prime = 0;

        for (int i = 1; i <= input; i++)
        {
            listOfNumbers.add(i);
        }


        for (int i = 1; i < input; i++)
        {
            for (int j = 0; j < input; j++)
            {
                if(listOfNumbers.get(i)%listOfNumbers.get(j) == 0)
                {
                    divisorCounter++; //For every number that is a factor of listOfNumbers.get(i) increment this value
                    prime = listOfNumbers.get(j);
                }
            }
            if(divisorCounter == 2)//A number is prime when only divisible by one and itself, or two factors
            {
                listOfPrimes.add(listOfPrimesCounter, prime);
                listOfPrimesCounter++;
            }
            prime = 0;//Reset for next loop
            divisorCounter = 0;
        }
        return listOfPrimes;
    }
}